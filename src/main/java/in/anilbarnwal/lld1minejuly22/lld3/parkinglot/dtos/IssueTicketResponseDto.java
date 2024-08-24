package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.dtos;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;

    //    private Ticket ticket;
//    private ResponseStatus responseStatus;
}
