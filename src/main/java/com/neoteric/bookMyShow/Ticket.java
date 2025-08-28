package com.neoteric.bookMyShow;

import java.util.Date;

public class Ticket {

    private String bookingId;
    private String status;
    private Date bookingDate;

    public Ticket(String bookingId, String status, Date bookingDate) {
        this.bookingId = bookingId;
        this.status = status;
        this.bookingDate = bookingDate;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getStatus() {
        return status;
    }

    public Date getBookingDate() {
        return bookingDate;
    }
}
