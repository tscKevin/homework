package com.train;

public class Ticket {
    int numberTicket;
    int roundTripNumberTickets;
    int oneWayPrice=1000;
    int roundTripPrice=2000;
    public Ticket(int numberTicket, int roundTripNumberTickets) {
        this.numberTicket = numberTicket;
        this.roundTripNumberTickets = roundTripNumberTickets;
    }
    public void compute(){
        int total = (int) (roundTripNumberTickets*roundTripPrice*0.9+(numberTicket-roundTripNumberTickets)*oneWayPrice);
        System.out.println("Total tickets: " + numberTicket + "\nRoind-trip: "
                + roundTripNumberTickets + "\nTotal: "
                + total);
    }
}
