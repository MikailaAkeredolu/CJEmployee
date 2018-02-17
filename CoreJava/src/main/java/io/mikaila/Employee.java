package io.mikaila;
import java.time.LocalDate;
import java.util.Random;

/**
 * Created by makerofapps on 12/5/17.
 */
public class Employee extends Person{

    private String name;
    private double salary;
    private LocalDate hireDay;
    protected String occupation = "protected job";

    public final int luckyNumber = 7;

    public static final double PI = 3.14;

    //Static fields - belongs to the class Not objects - only one for all objects of the class
    private  static int nextId = 1;
    private static int id; //static variables are rare

    //Static initialization block
    static{
        Random generator = new Random();
        //set nextId to a random number between 0 and 999
        nextId = generator.nextInt(1000);
    }

    //Object initialization Block
    {
        id = nextId;
        nextId++;

    }

    //constructor


    public Employee(String n, double s, int year, int month, int day ){
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);  //Obtains an instance of LocalDate from a year, month and day.
    }

    //Method
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent/100;
        this.salary += raise;
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    //Static Method - static method cannot access the non static instance but can access the static field
    public static int getNextID(){

        return nextId;
    }

    //non static cannot be referenced
//    public static String getNextID(){
//
//        return name;
//    }


    //static method - belong to class like Math.pow()..they do'nt have a this parameter
    public static void setId(){
        id = nextId;
        nextId++;
    }




    //Pass by Value and Pass by reference
    public static void trippleValue(double x){
        x = 3 * x;
        System.out.println(">>>>>>" + x);
    }

    //can change the state of of Object Parameters
    public static void trippleValue(Employee x){
        System.out.println("Employee x -> " + x);
        x.raiseSalary(200);
    }

//    public static void swap(Employee x, Employee y){
//        Employee temp = x;
//        x = y;
//        y = temp;
//    }

    @Override
    public String toString(){
       //return  getClass().getName() + '@' + Integer.toHexString(hashCode());
        return getClass().getName() + "name: " + name + " and his/her salary: " + salary + occupation;
    }


    //Final Method sample
    public final String printNickName(){
        return " Mc " + getName();
    }


    @Override
    public String getDescription() {
        return "is an employee and his salary is " + salary;
    }
}
