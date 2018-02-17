package io.mikaila;

/**
 * Created by makerofapps on 12/14/17.
 */
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(30,0, 8);
        bicycle.speedUp(5);
        System.out.println(bicycle.getSpeed());

        bicycle.speedUp(5, 100);
        System.out.println(bicycle.getSpeed());
    }
}
