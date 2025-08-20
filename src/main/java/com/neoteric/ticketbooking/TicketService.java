package com.neoteric.ticketbooking;

import java.util.UUID;

public class TicketService {
     public Ticket createTicket(Ticket ticket) {

         String pnr = UUID.randomUUID().toString();
         Ticket bookedTicket = new Ticket(
                    ticket.getName(),
                    pnr,
                    ticket.getServiceNumber(),
                    ticket.getSeatSelections()
         );
            return bookedTicket;
     }
}
