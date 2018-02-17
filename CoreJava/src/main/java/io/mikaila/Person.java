package io.mikaila;

/**
 * Created by makerofapps on 12/14/17.
 */
//Abstract class

public abstract class Person {

    private String name; //field

    public Person(){}  // default constructor

    public Person(String name){ // one parameter default constructor
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String willGiveInfractions(){
        return "someone is getting an infraction";
    }

    //Abstract method - just a stub - act as placeholders for methods in subclasses
    public abstract String getDescription();

}


/*
Note....
You can cannot instantiate an abstract class
But you can create objects of variables of an abstract class by using the non abstract subclass
Person p = new Student();

 */