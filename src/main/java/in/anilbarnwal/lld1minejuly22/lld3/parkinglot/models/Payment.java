package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private PaymentStatus status;
    private String transactionId;
    private PaymentMode paymentMode;
    private Bill bill;
    private Date paymentTime;
}
