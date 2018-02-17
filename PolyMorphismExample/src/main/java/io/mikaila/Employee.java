package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public abstract class Employee implements Payable{

    //Fields | instance Variables
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;

    //Constructor - this helps the subclasses

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setLasttName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lastName;
    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

//    public void setSocialSecurityNumber(String socialSecurityNumber) {
//        this.socialSecurityNumber = socialSecurityNumber;
//    }

    /*
    Polymorphism Demo Below !!!
    */

    //Overriding the toString Method

    @Override
    public String toString(){
        return getClass().getSimpleName() + " FirstName is: " + getFirstName() + " \nLastName is: " + getLasttName() + " \nSocial is : " + getSocialSecurityNumber();
    }

    //Abstract Method
    public abstract double earnings();

    //Implements Payable but since its an abstract class
    //It passes the implementation  responsibility down to the who extends it

}

/*
Create a Shape - Abstract
Give it an abstract Method called calculateArea
Create an instance of 3 different shapes
Override the toString method to print out the areas

create an array of 3 shapes then loop through to print out the shape and its area

 */
