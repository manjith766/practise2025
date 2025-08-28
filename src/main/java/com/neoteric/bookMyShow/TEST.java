package com.neoteric.bookMyShow;

public class TEST {
    public static void main(String[] args) {
        BookingService BookingService = new BookMyShowService();
        Ticket ticket = BookingService.bookTicket(2,250);

        System.out.println("Ticket booked with ID: " + ticket.getBookingId() + ", Status: " + ticket.getStatus() + ", Date: " + ticket.getBookingDate());
    }
}
