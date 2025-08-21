package com.neoteric.booking;

public class BookingTest {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();

        try {
            bookingService.bookTicket("2233", "ram", "2023-10-01");
            bookingService.bookTicket("2234", "shyam", "2023-10-01");
        }
        catch (insufficientTicketsException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
