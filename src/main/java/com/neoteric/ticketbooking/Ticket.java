package com.neoteric.ticketbooking;

import java.util.List;

public class Ticket {

    private String name;
    private String pnr;
    private String ServiceNumber;
    private List<SeatSelection> seatSelections;

    public Ticket(String name, String pnr, String serviceNumber, List<SeatSelection> seatSelections) {
        this.name = name;
        this.pnr = pnr;
        ServiceNumber = serviceNumber;
        this.seatSelections = seatSelections;
    }

    public Ticket(String name,String serviceNumber, List<SeatSelection> seatSelections){
        this(name,null,serviceNumber,seatSelections);
    }

    public String getName() {
        return name;
    }

    public String getPnr() {
        return pnr;
    }

    public String getServiceNumber() {
        return ServiceNumber;
    }

    public List<SeatSelection> getSeatSelections() {
        return seatSelections;
    }
}
