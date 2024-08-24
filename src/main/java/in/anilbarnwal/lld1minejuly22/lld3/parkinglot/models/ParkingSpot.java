package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import java.util.List;

public class ParkingSpot extends BaseModel {
    private String spotNumber;      //e.g A1, B5, G7 etc
    private ParkingSpotStatus status;
    private List<VehicleType> supportedVehicleTypes;
    private Long parkingFloorId;
}
