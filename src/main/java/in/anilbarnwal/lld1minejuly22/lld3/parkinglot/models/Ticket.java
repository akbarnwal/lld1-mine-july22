package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket extends BaseModel{
    private String ticketNumber;
    private Date entryTime;
    private Gate entryGate;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Operator generatedBy;
}
