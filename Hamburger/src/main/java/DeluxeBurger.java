/**
 * Created by makerofapps on 11/29/17.
 */
public class DeluxeBurger extends Hamburger {

    //set characters by default
    public DeluxeBurger(){
        super("Deluxe", "sausageBacon", 14.54, "white");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot addionail item to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot addionail item to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot addionail item to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot addionail item to deluxe burger");
    }



}
