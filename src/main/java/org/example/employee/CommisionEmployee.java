package org.example.employee;

public class CommisionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public CommisionEmployee(String firstName, String lastName, String ssnNumber, double commissionRate, double grossSales){
        super(firstName, lastName, ssnNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
}
