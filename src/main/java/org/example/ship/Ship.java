package org.example.ship;

public class Ship {
    protected String name;
    protected String year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public void print() {
        System.out.println("Name: "+ this.name + " - Year: " + this.year);
    }
}
