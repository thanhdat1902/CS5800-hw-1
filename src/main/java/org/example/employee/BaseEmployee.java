package org.example.employee;

public class BaseEmployee extends Employee{
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BaseEmployee(String firstName, String lastName, String ssnNumber, double baseSalary){
        super(firstName, lastName, ssnNumber);
        this.baseSalary = baseSalary;
    }
}
