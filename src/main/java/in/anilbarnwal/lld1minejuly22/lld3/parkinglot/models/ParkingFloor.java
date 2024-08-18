package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private int fl_id;
    private String floor_name;
    private List<Gate> gates;
    private ParkingFloorStatus parkingFloorStatus;

}
