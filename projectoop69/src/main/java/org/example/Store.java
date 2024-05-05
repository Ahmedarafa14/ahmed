package org.example;

public class Store extends Supplier {
    private String name;
    private String place;
    private String storetype;
    private String producttype;
    private String airportname;
    // defult Constructor
    public Store() {
    }

    public  Store(String name, String place, String storetype, String producttype, String airportname) {
        this.name = name;
        this.place = place;
        this.storetype = storetype;
        this.producttype = producttype;
        this.airportname = airportname;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStoretype() {
        return storetype;
    }

    public void setStoretype(String storetype) {
        this.storetype = storetype;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getAirportname() {
        return airportname;
    }

    public void setAirportname(String airportname) {
        this.airportname = airportname;
    }





}
