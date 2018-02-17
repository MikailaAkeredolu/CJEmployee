package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class SalariedEmployee  extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    //Implementation of the Abstract Earnings Method from the Abstract Employee Class

    public double earnings() {
        return getWeeklySalary();
    }

    //Override the toString Method to customize output for salried employees
    @Override
    public String toString(){
      return  super.toString() + " weekly salary is " + getWeeklySalary();
    }

    //Must Implement Payable Interface's abstract method
    public double getPaymentAmount() {
        return this.weeklySalary;
    }
}
