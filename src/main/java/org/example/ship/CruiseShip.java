package org.example.ship;

public class CruiseShip extends Ship{
    private int maxNumberOfPassengers;

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public CruiseShip(String name, String year, int maxNumberOfPassengers) {
        super(name, year);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public void print() {
        System.out.println("Name: "+ this.name + " - Maximum number of passengers: " + this.maxNumberOfPassengers);
    }
}
