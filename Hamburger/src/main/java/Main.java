/**
 * Created by makerofapps on 11/29/17.
 */
public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "suausage", 3.56, "white");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        System.out.println("====================================");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger Price is " + healthyBurger.itemizeHamburger());
        System.out.println("====================================");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition1("fries", 2.10);

    }
}
