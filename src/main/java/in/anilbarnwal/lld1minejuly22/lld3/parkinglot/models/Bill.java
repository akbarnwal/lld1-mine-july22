package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Ticket ticket;
    private Gate gate;
    private Operator generatedBy;
    private int amount;
    private BillStatus status;
    private List<Payment> payments;
    private Date exitTime;
}
