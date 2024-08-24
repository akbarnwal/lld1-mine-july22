package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle extends BaseModel {
    private String ownerName;
    private String ownerContactNumber;
    private String registrationNumber;
    private VehicleType vehicleType;
}
