/**
 * Created by makerofapps on 11/18/17.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name,String size, int wheels, int doors, int gears, boolean isManual){
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;  //setting default field
    }


    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() changed to " + this.currentGear + "gear");
    }

    public void changeVelocity(int speed, int direction){

        System.out.println("Car.chnageVelocity(): Velocity " + speed + "direction" + direction);
        move(speed, direction);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int geers) {
        this.gears = geers;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }


//   @Override
//    public void stop(){
//
//   }



}
