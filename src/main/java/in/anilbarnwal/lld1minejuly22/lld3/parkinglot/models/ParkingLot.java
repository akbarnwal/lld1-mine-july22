package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus status;
    private List<Gate> gates;
    private List<Vehicle> supportedVehicles;
    private String owner;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;
    private FeeCalculationStrategyType feeCalculationStrategyType;
}
