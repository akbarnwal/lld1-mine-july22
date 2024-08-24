package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel{
    private GateType gateType;
    private GateStatus gateStatus;
    private ParkingLot parkingLot;
    private Operator operator;
}
