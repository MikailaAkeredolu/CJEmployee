package io.mikaila;

/**
 * Created by makerofapps on 12/14/17.
 */
public class Manager extends  Employee{

    //member field
    private double bonus;
    protected String nickName;

    //every manager has 4 fields now that we inherit from Employee class
    public Manager(String n, double s, int year, int month, int day ){
        super(n, s, year, month, day);
        bonus = 0;

    }

    public String printOccupation(){
        return this.occupation;
    }


    //setter
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //Override the getSalary method of the Super Class / Employee class
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }


}
