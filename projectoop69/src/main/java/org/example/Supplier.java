package org.example;

public class Supplier extends User {
    private String type;

    public Supplier() {
    }

    public Supplier(String name, String type, int id) {
      super(id, name);
        this.type = type;

    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }










}
