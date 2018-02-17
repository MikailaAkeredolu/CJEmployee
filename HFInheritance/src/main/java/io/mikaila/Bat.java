package io.mikaila;

/**
 * Created by makerofapps on 12/21/17.
 */
public class Bat extends Mammals {

    private int age;

    public Bat(String name, int age) {
        super(name);
        this.age = age;
    }


    String move() {
        return "Bats move by flying";
    }

    @Override
    public String eat(){
        super.eat();
        return "Bats eat Mangoes";
    }
}
