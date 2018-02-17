package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class Turtle extends Reptiles implements Pet{

    String walkSlow() {
        return " Turtles walk slowly";
    }

    public String beFriendly() {
        return "when turtles are friendly they smile";
    }

    public String play() {
        return "turtles let scratch their necks";
    }
}
