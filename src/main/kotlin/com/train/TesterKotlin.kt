package com.train

import java.util.*

class TicketKt (val numberTicket: Int, val numberRoundTrip: Int){
    fun compute(){
        print(((numberTicket-numberRoundTrip) *1000+numberRoundTrip*2000*0.9).toInt())
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var numberTicket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTripNumberTickets = scanner.nextInt()

    val ticket = TicketKt(numberTicket,roundTripNumberTickets)
    ticket.compute()
}