package org.example;

//import static org.example.BookingAgent.TicketReservationSystem.totalTickets;

public class Flight extends flightCompany {



    protected int numOfPassenger = BookingAgent.totalTickets;
   private int planId,arrivalHour,departureHour;
    private String departureAirport,arrivalAirport;
    private String date;

     public Flight(){}

    public Flight(double id, String flightCompanyName, int numOfPassenger, int planId, int arrivalHour, int departureHour, String departureAirport, String arrivalAirport,String date) {
        super(id, flightCompanyName);
        this.date=date;
        this.numOfPassenger= numOfPassenger;
        this.planId = planId;
        this.arrivalHour = arrivalHour;
        this.departureHour = departureHour;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPassenger() {
        return numOfPassenger;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public int getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalHour(int ArrivalHour) {
        this.arrivalHour = ArrivalHour;
    }

    public int getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(int departureHour) {
        this.departureHour = departureHour;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {

         this.arrivalAirport = arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "numOfPassenger=" + numOfPassenger +
                ", planId=" + planId +
                ", arrivalHour=" + arrivalHour +
                ", departureHour=" + departureHour +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", date='" + date + '\'' +
                ", flightCompanyName='" + flightCompanyName + '\'' +
                ", id=" + id +

                '}';
    }
}





