package org.example;

import java.util.ArrayList;

public class User {
    protected double id ;
    protected  String name ;
    private ArrayList<Ticket> tickets;




    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    /*public void bookTicket(int orderNumber, String flightCompany, String seatClass, double price, String flightNumber, String passengerName) {
        Ticket ticket = new Ticket(orderNumber, flightCompany, seatClass, price, flightNumber, passengerName);
        tickets.add(ticket);
        System.out.println("You have successfully booked a ticket.");
    }*/
}
