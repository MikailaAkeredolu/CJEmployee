package Pez;

/**
 * Created by makerofapps on 10/15/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("We are making a new Pez Dispenser");

        //Create a new object - instance
        PezDispenser dispenser = new PezDispenser("Yoda", 29);
        //print the object
        System.out.println(dispenser); // reference to object

        //Setter
        dispenser.setCharacterName("Darth Vader");

        //Getter
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());

        //call the method
       System.out.println(dispenser.customPez());
        //dispenser.customPez();


    }
}
