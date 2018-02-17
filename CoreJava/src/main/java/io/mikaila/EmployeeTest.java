package io.mikaila;
import java.text.NumberFormat;
import java.util.*;
import java.time.*;


/**
 * Created by makerofapps on 12/5/17.
 */
public class EmployeeTest {
    public static void main(String[] args) {

    Employee employee1 = new Employee("KodakBlack", 200.0, 2017, 04, 12);
        System.out.println(employee1);
    Employee employee2 = new Employee("CardiB", 100.0, 2018, 03, 20);
        System.out.println("This is my To String Method " + employee1.toString());
        System.out.println("=================================");
        //////////////////////////////INHERITANCE//////////////////////////////////

    Manager boss = new Manager("GucciMane", 100000, 1987, 12, 15);
        System.out.println(boss);
    boss.nickName = "the boss";

        System.out.println("=====================>");
        System.out.println(boss.nickName);
        System.out.println(boss.toString());
    boss.setBonus(50000);
    System.out.println("The Manager's/boss's salary is " + boss.getSalary());

    System.out.println(boss.printOccupation());

    System.out.println("================================");


    ////////////////////////////////////////////////////////////////////////


      //Methods can change the state of of Object Parameters
       // System.out.println(employee1.getSalary());

        Employee.trippleValue(employee1);
        System.out.println("Salary after raise ==> " + employee1.getSalary());
        System.out.println("=====================================================");

        System.out.println(employee2.toString());
        System.out.println("=====================================================");



        Employee[] staff = new Employee[4];
        staff[0] = boss; // is a rule ...a manager is an employee
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        staff[3] = new Manager("Erika Badu",20000, 1978, 5, 19);

//        for (Employee e : staff) {
//            e.raiseSalary(5);
//        }

        for (Employee e : staff) {
            System.out.println(" name = " + e.getName() + " Salary = " + e.getSalary() + " hireDay = " + e.getHireDay());
        }
        System.out.println("=====================================================");

/*
Notice that e can use the correct getSalary method -- this is polymorphism
Automatically selecting the appropriate type at runtime is called dynamic binding
 */








        //employee2 = null;  // Null Pointer exception

        //lucky number
        //employee1.luckyNumber = 777;


    //Methods cannot modify numeric parameters
//        double percent = 10;
//        Employee.trippleValue(percent);
//        System.out.println(" 10 percent " +  percent);
        //Methods cannot attach new objects to object parameters



        /*
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println(" name = " + e.getName() + " Salary = " + e.getSalary() + " hireDay = " + e.getHireDay());
        }

        int n = Employee.getNextID();
        System.out.println("Next available Id " + n);


//factory Methods - can also have static factory methods thar  constructs objects
//Can be used to construct objects with various types

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;
        System.out.println(currencyFormatter.format(x));  //$0.10
        System.out.println(percentFormatter.format(x));  //10%
*/

    }
}
