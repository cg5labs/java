package com.example.parking;

import java.util.ArrayList;
import java.util.Random;

public class Ticket {
    private int ticketID;
    private String carplate;


    public Ticket(String carplate) {
        this.carplate = carplate;
        this.ticketID = getTicketID(carplate);
    }

    public int getTicketID(String carplate) {
        Random ticketNum = new Random();
        int ticketID = ticketNum.nextInt(100);
        this.carplate = carplate;
        return ticketID;
    }
}
