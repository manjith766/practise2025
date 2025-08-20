package com.neoteric.ticketbooking;

public class SeatSelection {
    private String seatNumber;
    private String seatType;
    private boolean isWindowsSeat;

    public SeatSelection(String seatNumber, String seatType, boolean isWindowsSeat) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isWindowsSeat = isWindowsSeat;

    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public boolean isWindowsSeat() {
        return isWindowsSeat;
    }

    public void setWindowsSeat(boolean windowsSeat) {
        isWindowsSeat = windowsSeat;
    }
}
