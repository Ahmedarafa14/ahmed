package org.example;

public class Ticket extends flightCompany{

private int orderNum;
private String flightCompany;
private double price =15000;
private int flightNumber;
private String passengerName;


private static int numOfBookedticket;
public Ticket() {
        }

// Constructor
public Ticket(int orderNum, String flightCompany, double price, int flightNumber, String passengerName) {
        this.orderNum = orderNum;
        this.flightCompany = flightCompany;
        this.price = price;
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        }



// Getters and setters
public int getOrderNum() {
        return orderNum;
        }

        public void setOrderNum(int orderNum) {
                this.orderNum = orderNum;
        }

        public String getFlightCompany() {
        return flightCompany;
        }

public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
        }





public double getPrice() {
        return price;
        }

public void setPrice(double price) {
        this.price = price;
        }

public int getFlightNumber() {
        return flightNumber;
        }

public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
        flightNumber++;

        }

public String getPassengerName() {
        return passengerName;
        }

public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
        }

public static void add(Ticket newTicket) {
        numOfBookedticket++;

}


        }






















