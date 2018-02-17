package io.mikaila;

/**
 * Created by makerofapps on 12/14/17.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Mike Jones", 50000, 1988, 10, 23);
        people[1] = new Student("Liz", "Computer Science");

        for (Person x : people) {
            System.out.println(x.getName() + " " + x.getDescription());
        }
    }
}
