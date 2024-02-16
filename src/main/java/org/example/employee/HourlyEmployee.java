package org.example.employee;

public class HourlyEmployee extends Employee {
    private double wage;
    private int hoursWork;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public HourlyEmployee(String firstName, String lastName, String ssnNumber, double wage, int hoursWork){
        super(firstName, lastName, ssnNumber);
        this.wage = wage;
        this.hoursWork = hoursWork;
    }
}