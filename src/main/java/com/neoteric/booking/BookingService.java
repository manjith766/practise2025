package com.neoteric.booking;

public class BookingService {

    public int availableTickets = 1;

    public void bookTicket(String bookingId, String customerName, String bookingDate) throws insufficientTicketsException {
        if (availableTickets > 0) {
            availableTickets--;
            System.out.println(" Booking successful for " + customerName + " on " + bookingDate);

        } else {
            throw new insufficientTicketsException("No tickets available for booking");
        }

    }
}
