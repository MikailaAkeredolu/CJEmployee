package io.mikaila;

/**
 * Created by makerofapps on 12/14/17.
 */
public class Student extends Person{
    private String major;

    //constructor
    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "Majors in " + major;
    }
}
