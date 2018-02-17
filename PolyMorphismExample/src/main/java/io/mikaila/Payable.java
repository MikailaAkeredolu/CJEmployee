package io.mikaila;

/**
 * Created by makerofapps on 12/19/17.
 * Purpose of this interface is to figure out a payable amount
 */
public interface Payable {

    //abstract method - public and abstract by default!!!
    double getPaymentAmount();

}









//No instance variables and no method bodies
//Only describes abstarct methods
//You can implement multiple interfaces and only extend one class
//Once a class implements an interface, its subclasses also implement that interface
//Interface may contain public static data//If an interface has no body - its a tagging interface - such as serializable (you are just saying you now have the ability to take objects and write them as streams)
