package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Tre", 75000.0);
        System.out.println(employeeOne.raiseSalary(1000.0));
        System.out.println(employeeOne.toString());

        Manager managerOne = new Manager("KIM", 85000.0, "SUPERVISOR");
        managerOne.setManagerTitle("Scrum Master");
        System.out.println(managerOne.getManagerTitle());
        System.out.println( managerOne.raiseSalary(2000));
        managerOne.nickName = "Pookie";
        System.out.println(managerOne.nickName);
        System.out.println(managerOne.toString());


    }
}

/*

Create an instance/object  of a Manager
Set the manager's title to "Scrum Master"
Then print out the manager's title
Call the method to raise the manager's salary
Set the nickname of the Manager using your object/instance
Print the nickname of the manager using your object/intstance
Use the toString to print out the employee instance/object

 */