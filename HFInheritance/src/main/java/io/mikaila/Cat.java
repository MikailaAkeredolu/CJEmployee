package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class Cat extends Feline implements Pet{

    @Override
    public String roam() {

        return "Cats avoid their type";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String eat() {
        return "Cats eat fish and drinks milk";
    }

  //Interfaces
    public String beFriendly() {
        return "Cats lick you when they like you";
    }

    public String play() {
        return "Cats play by jumping on things";
    }
}
