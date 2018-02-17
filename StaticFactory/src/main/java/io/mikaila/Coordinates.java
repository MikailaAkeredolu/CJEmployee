package io.mikaila;

/**
 * Created by makerofapps on 12/15/17.
 */
//Used to create factory objects
    //Static Factory - a static method that returns an instance of a class
public class Coordinates {

   private double x_coord;
   private static double y_coord;

    public Coordinates(double x, double y){
        x_coord = x;
        y_coord = y;
    }



    //Static Factory Methods

    public static final Coordinates fromXY(double x, double y){
     return new Coordinates(x,y);
    }

    public static final Coordinates fromPolar(double dist, double angle){
        return  new Coordinates(dist * Math.cos(angle), dist * Math.cos(angle));
    }

}
