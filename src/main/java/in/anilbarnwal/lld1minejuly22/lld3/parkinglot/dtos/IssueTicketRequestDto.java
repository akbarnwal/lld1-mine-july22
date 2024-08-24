package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.dtos;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketRequestDto {
    private Long gateId;
    private VehicleType vehicleType;
    private String owner;
    private String registrationNumber;
}
