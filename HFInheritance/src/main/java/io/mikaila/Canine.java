package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
//Abstract Class
public abstract class Canine extends Animal  {

    //Abstract Method
    public abstract String roam();

    //Concrete Methods
    public String hasCanineTeeth(){
        return "Yes all canines have a canine teeth";
    }

}
