package com.neoteric.ticketbooking;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        SeatSelection seat1 = new SeatSelection("1A", "Economy", true);
        SeatSelection seat2 = new SeatSelection("1B", "Economy", false);


        Ticket ticket = new Ticket("ram", "12345", "Flight123", Arrays.asList(seat1,seat2));
        System.out.println("hascode"+ticket.hashCode());


        TicketService ticketService = new TicketService();
        System.out.println("hascode"+ticketService.hashCode());


        Ticket bookedTicket = ticketService.createTicket(ticket);


        System.out.println("Ticket booked successfully!");
        System.out.println("Name: " + bookedTicket.getName());
        System.out.println("PNR: " + bookedTicket.getPnr());
        System.out.println("Service Number:"+bookedTicket.getServiceNumber());
        System.out.println("Seat  Selections:");

    }
}
