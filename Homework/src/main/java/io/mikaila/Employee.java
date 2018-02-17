package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class Employee {
    private String name;
    private double salary;
    protected String nickName;



    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(double raise){
        return this.salary + raise;
    }

    @Override
    public String toString(){
       return  getClass().getSimpleName() + name;
    }

//    public String printName(){
//        return "io.mikaila.Employee name is " + name;
//    }

    public String printName(){

        return "Employee name is " + name + "employee nickname is " + nickName;
    }






//      @Override
//    public String toString(){
//        //return  getClass().getName() + '@' + Integer.toHexString(hashCode());
//        return getClass().getName() + "name: " + name + " and his/her salary: " + salary + occupation;
//    }

}
