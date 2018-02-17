package javabasics;

/**
 * Created by makerofapps on 10/14/17.
 */


public class FirstClass {
    public String name;
    public int age;

    //constructor
    public FirstClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method
    public String printProps(){
       return "my name is " + this.name + " my age is " + this.age;
    }

}


