package com.neoteric.booking;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking {
    private String bookingId;
    private String customerName;
    private LocalDateTime bookingDate;


    public Booking(String bookingId, String customerName, String bookingDate) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.bookingDate = LocalDateTime.parse(bookingDate);
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getBookingDate() {
        return bookingDate.toString();
    }
}
