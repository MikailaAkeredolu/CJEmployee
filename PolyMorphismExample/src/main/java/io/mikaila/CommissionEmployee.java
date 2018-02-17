package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 * Inheritance
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commisionRate;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate){
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }


    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public double earnings() {
        return getCommisionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return super.toString();
    }

    //Must Implement Payable Interface's abstract method
    public double getPaymentAmount() {
        return this.earnings();
    }
}
