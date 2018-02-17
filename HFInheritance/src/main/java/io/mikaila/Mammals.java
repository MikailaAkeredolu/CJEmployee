package io.mikaila;

/**
 * Created by makerofapps on 12/21/17.
 */
public abstract class Mammals {

    private String name;

    public Mammals(){

    }

    public Mammals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String move();

    //implemented
    public String eat(){
        return "All Mammals eat";
    }


}
