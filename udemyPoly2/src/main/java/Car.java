/**
 * Created by makerofapps on 11/29/17.
 */

class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name){
        this.cylinders= cylinders;
        this. name = name;
        this.wheels = 4;
        this.engine = true;

    }

    public String startEngine(){
        return "Car => startEngine()";
    }

    public String accelerate(){
        return "Car => accelerate()";
    }


    public String brake(){
        return "Car => brake()";
    }

    public int getCyclinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


}


