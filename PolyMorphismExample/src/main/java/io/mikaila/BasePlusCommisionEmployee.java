package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class BasePlusCommisionEmployee extends CommissionEmployee {

    private double basesalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate, double basesalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
        this.basesalary = basesalary;
    }

    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

    @Override
    public double earnings() {
        return this.basesalary + super.earnings();
    }


    @Override
    public String toString(){
        return super.toString();
    }

    //No need to Implement Payable Interface's abstract method because its superclass already did so
}
