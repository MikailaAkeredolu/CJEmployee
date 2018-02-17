package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class Dog extends Canine implements Pet {


    public String wag(){

        return "wags tail";
    }

  @Override
    public String roam() {
        return "dogs often roams with their owner";
    }

    @Override
    public String makeSound() {

        return "woof woof";
    }

    @Override
    public String eat() {

        return "Dogs eat bones";
    }

  //Interface Method
    public String beFriendly() {

        return "Dogs jump on you when they meet you";
    }
    //Interface Method

    public String play() {
        return "Dogs wag their tales and chase after balls";
    }
}
