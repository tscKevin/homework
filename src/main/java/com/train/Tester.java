package com.train;

import javax.naming.OperationNotSupportedException;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
//        hw2
        Ticket ticket = new Ticket();
        ticket.buyTicket();
//        hw1
        System.out.print("hw1, Buy for one-times");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int numberTicket = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundTripNumberTickets = scanner.nextInt();
        Ticket ticket2 = new Ticket();
        ticket2.compute(numberTicket, roundTripNumberTickets);
    }
}
