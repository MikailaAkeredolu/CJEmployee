package io.mikaila;

/**
 * Created by makerofapps on 12/21/17.
 */
//Subclass
public class Monkey extends Mammals{

    private int age;

    public Monkey(String name, int age){
        super(name);

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   //Implementi g
    String move() {
        return "Monkeys move by walking with their hands and legs";
    }

    @Override
    public String eat(){
        return "Monkeys eat Bananas";
    }
}



/*
private name
private age
Make sure it has a constructor
Make sure it has a getter and a setter for name and age
(Hint) You will need to create a constructor in your concrete class by leveraging the super keyword
 */
