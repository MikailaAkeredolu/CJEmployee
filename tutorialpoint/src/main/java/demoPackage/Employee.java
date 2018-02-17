package demoPackage;
import java.io.*;
/**
 * Created by makerofapps on 10/26/17.
 */
public class Employee {
    String name;
    Integer age;
    String designation;
    double salary;

    public Employee(String name){
        this.name = name;

    }

    public void empAge(Integer empAge){
        age = empAge;
    }

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Designation " + designation);
        System.out.println("Salary " + salary);
    }
}
