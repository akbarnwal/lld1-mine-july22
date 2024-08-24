package in.anilbarnwal.lld1minejuly22.lld3.parkinglot.controllers;

import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.dtos.IssueTicketRequestDto;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.dtos.IssueTicketResponseDto;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.dtos.ResponseStatus;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.exceptions.GateNotFoundException;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.models.Ticket;
import in.anilbarnwal.lld1minejuly22.lld3.parkinglot.services.strategies.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {
        IssueTicketResponseDto ticketResponseDto = new IssueTicketResponseDto();

        try {
            Ticket ticket = ticketService.issueTicket(
                    issueTicketRequestDto.getGateId(),
                    issueTicketRequestDto.getRegistrationNumber(),
                    issueTicketRequestDto.getVehicleType(),
                    issueTicketRequestDto.getOwner()
            );
            ticketResponseDto.setTicket(ticket);
            ticketResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (GateNotFoundException e) {
            System.out.println(e.getMessage());
            ticketResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return ticketResponseDto;
    }
}
