package person;

/**
 * Created by makerofapps on 7/24/17.
 */
public class mainApp {

    public static void main(String[] args) {
        Person p1 = new Person("Mike", 39);
        String p1name = p1.getName();
        int p1age = p1.getAge();

        System.out.println(p1name + " " + p1age);

    }

}
