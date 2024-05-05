package org.example;

import java.util.Scanner;

public class flightCompany extends AboutTheAirport {

protected  String flightCompanyName ;

    public flightCompany(){}
    public String getFlightCompanyName() {
        return flightCompanyName;
    }

    public void setFlightCompanyName(String flightCompanyName) {
        this.flightCompanyName = flightCompanyName;
    }

    // Parameterized constructor
        public flightCompany(double id, String flightCompanyName) {
            this.id = id;
            this.flightCompanyName = flightCompanyName;

        }




         }




