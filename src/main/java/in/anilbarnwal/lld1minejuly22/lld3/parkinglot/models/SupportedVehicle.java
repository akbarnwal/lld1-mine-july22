package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SupportedVehicle extends BaseModel {
    private int sv_id;
    private long registered_number;
    private VehicleType vehicleType;
}
