package com.train;

import javax.naming.OperationNotSupportedException;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        int numberTicket = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundTripNumberTickets = scanner.nextInt();
        Ticket ticket = new Ticket(numberTicket, roundTripNumberTickets);
        ticket.compute();
    }
}
