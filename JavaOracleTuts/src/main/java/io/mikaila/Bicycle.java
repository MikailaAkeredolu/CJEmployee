package io.mikaila;

/**
 * Created by makerofapps on 12/14/17.
 */
public class Bicycle {

    // the Bicycle class has three fields
    private int cadence;
    private int gear;
    private int speed;

    // constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }



    // - Access Modifiers
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    //Overloading
    public void speedUp(int increment, int turbo) {
        speed += increment;
        speed += turbo;
    }


}
