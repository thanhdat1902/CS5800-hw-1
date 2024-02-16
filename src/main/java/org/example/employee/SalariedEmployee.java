package org.example.employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, String ssnNumber, double weeklySalary){
        super(firstName, lastName, ssnNumber);
        this.weeklySalary = weeklySalary;
    }
}