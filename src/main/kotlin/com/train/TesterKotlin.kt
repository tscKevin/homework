package com.train

import java.util.*

class TicketKt (){
    fun compute(numberTicket: Int, numberRoundTrip: Int) {
        var total = ((numberTicket-numberRoundTrip) *1000+numberRoundTrip*2000*0.9).toInt()
        println("Total tickets: $numberTicket \nRound-trip: $numberRoundTrip \nTotal: $total")
    }
    fun buyTicket() {
        val scanner = Scanner(System.`in`)
        var numberTicket=0
        var roundTripNumberTickets=0
        while (numberTicket != -1 && roundTripNumberTickets != -1) {
            print("Please enter number of tickets or Enter -1 to exit:")
            numberTicket = scanner.nextInt()
            if (numberTicket <= 0) continue;
            print("How many round-trip tickets: ")
            roundTripNumberTickets = scanner.nextInt()
            if (roundTripNumberTickets <= 0 || roundTripNumberTickets > numberTicket) continue;
            compute(numberTicket, roundTripNumberTickets)
        }
    }
}

fun main(args: Array<String>) {
    val ticket = TicketKt()
    ticket.buyTicket()
}
