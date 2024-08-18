package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.feecalculation.FeeCalculationAlgorithm;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.spotassignment.SpotAssignmentAlgorithm;

import java.util.List;

public class ParkingLot extends BaseModel{
    private int pl_id;
    private String name;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private String address;
    private String owner;
    private ParkingLotStatus parkingLotStatus;
    private FeeCalculationAlgorithm feeCalculationAlgorithm;
    private SpotAssignmentAlgorithm spotAssignmentAlgorithm;
    private List<SupportedVehicle> supportedVehicles;


}
