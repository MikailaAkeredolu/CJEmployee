package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage,  double hours){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //Implementation of Abstract method
    public double earnings() {
        if(getHours() <= 40){
            return getHours() * getWage();
        }else{
           return  (getHours() * getWage()) * 1.5;
        }
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
