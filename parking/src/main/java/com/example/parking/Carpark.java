package com.example.parking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carpark {
    public static void main(String[] args) {

        System.out.println("Carpark stuff...");

        ArrayList<String> ticketsIssued = new ArrayList<>();

        Person harry = new Person();
        harry.setLastName("Meyer");

        String carplate = "US-123";

        Ticket harry_car = new Ticket(carplate);

        System.out.println(harry.getLastName() + " uses " + harry_car.getTicketID(carplate));

    }
}

