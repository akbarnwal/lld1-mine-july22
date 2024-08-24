package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.exceptions.GateNotFoundException;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.*;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.repository.*;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.factories.FeeCalculationStrategyFactory;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.factories.SpotAssignmentStrategyFactory;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.feecalculation.FeeCalculationStrategy;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.spotassignment.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private TicketRepository ticketRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository,
    ParkingFloorRepository parkingFloorRepository,
    ParkingLotRepository parkingLotRepository,
    ParkingSpotRepository parkingSpotRepository,
    TicketRepository ticketRepository,
    VehicleRepository vehicleRepository){
        this.gateRepository = gateRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.ticketRepository = ticketRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(
            Long gateId,
            String vehicleNumber,
            VehicleType vehicleType,
            String ownerName
    ) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        // findGateById
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
        if(optionalGate.isEmpty()){
            throw new GateNotFoundException("Gate not found" + gateId);
        }

        Gate entryGate = optionalGate.get();
        ticket.setEntryGate(entryGate);
        ticket.setGeneratedBy(entryGate.getOperator());

        // Get the Vehicle details if present else create a new vehicle
        Vehicle savedVehicle = vehicleRepository.findByRegistrationNumber(vehicleNumber);
        if(savedVehicle == null){
            Vehicle vehicle = new Vehicle();

            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            vehicle.setRegistrationNumber(vehicleNumber);
            savedVehicle = vehicleRepository.save(vehicle);
        }
        ticket.setVehicle(savedVehicle);

        // Get the ParkingSpot
        Long parkingLotId = entryGate.getParkingLot().getId();
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(parkingLotId);

        SpotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.getSpotAssignmentStrategyType();
        SpotAssignmentStrategy spotAssignmentStrategy =
                SpotAssignmentStrategyFactory.getSpotAssignmentStrategy(spotAssignmentStrategyType);

        FeeCalculationStrategyType feeCalculationStrategyType = parkingLot.getFeeCalculationStrategyType();
        FeeCalculationStrategy feeCalculationStrategy = FeeCalculationStrategyFactory.getFeeCalculationStrategy(feeCalculationStrategyType);
        Long feeCharges = feeCalculationStrategy.getFeeCalculationStrategy();

        ticket.setParkingSpot(spotAssignmentStrategy.assignParkingSpot(vehicleType));
        ticket.setTicketNumber("TXYP34456");
        return ticket;
    }
}
