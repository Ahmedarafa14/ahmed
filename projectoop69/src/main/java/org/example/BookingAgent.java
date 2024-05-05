package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingAgent extends flightCompany {

    protected String agentName, companyPlace;
    protected double price;
    protected int  flightNumber;
    protected int orderNumber;
    private ArrayList<Ticket> tickets;
    protected static int totalTickets = 100;

    private int bookingList;


    public BookingAgent(String flightCompanyName, String agentName, String companyPlace, double id, double price, int flightNumber ){
        super(id, flightCompanyName);
        this.agentName = agentName;
        this.companyPlace = companyPlace;
        this.price = price;
        this.flightNumber = flightNumber;
        this.tickets = new ArrayList<>();


    }



    public BookingAgent() {

        this.tickets = new ArrayList<>();

    }


    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }


    public String getCompanyPlace() {
        return companyPlace;
    }
    Scanner scanner=new Scanner(System.in);
    public void bookTicket(Scanner scanner) {
        Ticket newTicket = new Ticket();

        // Prompt the user to enter ticket details
        System.out.print("Enter order number: ");
        newTicket.setOrderNum(20);

        scanner.nextLine(); // Consume newline

        System.out.print("Enter flight company: ");
        newTicket.setFlightCompany(scanner.nextLine());



        System.out.print("Enter price: ");
        newTicket.setPrice(15000);

        scanner.nextLine(); // Consume newline

        System.out.print("Enter flight number: ");
        newTicket.setFlightNumber(5000);

        System.out.print("Enter passenger name: ");
        newTicket.setPassengerName(scanner.nextLine());

        // Add the new ticket to the list of tickets
        tickets.add(newTicket);
        System.out.println("You have successfully booked a ticket.");
        Ticket.add(newTicket);
        System.out.println("You have successfully booked a ticket.");
        if (bookingList <= totalTickets) {
            for (int i = 0; i <= totalTickets; i++) {

                i = bookingList;
                bookingList++;
                break;
            }


        }
    }

        public int getOrderNumber () {
            return orderNumber;
        }

        public void setOrderNumber ( int orderNumber){
            this.orderNumber = orderNumber;
        }

        public static int getTotalTickets () {
            return totalTickets;
        }

        public static void setTotalTickets ( int totalTickets){
            BookingAgent.totalTickets = totalTickets;
        }


        public void setCompanyPlace (String companyPlace){
            this.companyPlace = companyPlace;
        }


        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }


        public int getFlightNumber () {
            return flightNumber;
        }

        public void setFlightNumber ( int flightNumber){
            this.flightNumber = flightNumber;
        }



    }