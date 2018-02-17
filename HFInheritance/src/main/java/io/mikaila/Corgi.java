package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class Corgi extends Dog {

    public String name;
    public int age;

    //Constructor
    public Corgi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String wag(){

        return "wags tail like a corgi";
    }
    //Did not declare a method for Corgi to wag


    @Override
    public String beFriendly() {
        System.out.println("Corgi's jump and snuggle when been friendly");
        return super.beFriendly();

    }
}
