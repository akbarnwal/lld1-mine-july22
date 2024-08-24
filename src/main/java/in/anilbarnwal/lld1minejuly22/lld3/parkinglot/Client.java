package in.anilbarnwal.lld1minejuly22.lld3.parkinglot;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.controllers.TicketController;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.dtos.IssueTicketRequestDto;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.dtos.IssueTicketResponseDto;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.VehicleType;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.repository.*;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.TicketService;

public class Client {
    private static GateRepository gateRepository = new GateRepository();
    private static TicketRepository ticketRepository = new TicketRepository();
    private static ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    private static ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
    private static ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
    private static VehicleRepository vehicleRepository = new VehicleRepository();

    private static TicketService ticketService = new TicketService(
            gateRepository,
            parkingFloorRepository,
            parkingLotRepository,
            parkingSpotRepository,
            ticketRepository,
            vehicleRepository
    );

    public static void main(String[] args) {
        demoParkingLotTicket();
    }

    private static void demoParkingLotTicket() {
        //Dto
        IssueTicketRequestDto ticketRequestDto = new IssueTicketRequestDto();
        ticketRequestDto.setGateId(1L);
        ticketRequestDto.setRegistrationNumber("KAHD3661");
        ticketRequestDto.setVehicleType(VehicleType.FOUR_WHEELER);
        ticketRequestDto.setOwner("Anil");

        TicketController ticketController = new TicketController(ticketService);


        IssueTicketResponseDto ticketResponseDto = ticketController.issueTicket(ticketRequestDto);
        System.out.println(ticketResponseDto.getTicket());

    }
}
