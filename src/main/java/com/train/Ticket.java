package com.train;

import java.util.Scanner;

public class Ticket {
    int oneWayPrice=1000;
    int roundTripPrice=2000;
    float rebate=0.9f;
    public Ticket(){

    }
    public Ticket(int numberTicket, int roundTripNumberTickets) {
        compute(numberTicket,roundTripNumberTickets);
    }
    public void compute(int numberTicket, int roundTripNumberTickets){
        int total = (int) (roundTripNumberTickets*roundTripPrice*rebate+(numberTicket-roundTripNumberTickets)*oneWayPrice);
        System.out.println("Total tickets: " + numberTicket + "\nRoind-trip: "
                + roundTripNumberTickets + "\nTotal: "
                + total);
    }
    public void buyTicket() {
        Scanner scanner = new Scanner(System.in);
        int numberTicket = 0, roundTripNumberTickets = 0;
        while (numberTicket != -1 && roundTripNumberTickets != -1) {
            System.out.print("Please enter ticket number or Enter -1 to exit: ");
            numberTicket=scanner.nextInt();
            if(numberTicket<=0) continue;
            System.out.print("How many round-trip tickets: ");
            roundTripNumberTickets=scanner.nextInt();
            if(roundTripNumberTickets<=0 || roundTripNumberTickets>numberTicket) continue;
            compute(numberTicket,roundTripNumberTickets);
        }
    }
}
