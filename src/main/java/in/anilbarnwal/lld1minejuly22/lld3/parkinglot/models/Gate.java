package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel{
    private int gate_id;
    private String name;
    private GateStatus gateStatus;
    private GateType gateType;
//    private parking_lost gate;
}
