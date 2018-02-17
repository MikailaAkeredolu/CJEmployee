package io.mikaila;
import java.util.ArrayList;
/**
 * Created by makerofapps on 12/18/17.
 */
public class Main {
    public static void main(String[] args) {


        Employee[] staff = new Employee[4];

        staff[0] = new HourlyEmployee("Mike", "HourlyEmployee", "120-34-7890", 10, 40);
        staff[1] = new CommissionEmployee("Jerry", "CommissionedEmployee", "129-87-5679",100, 20);
        staff[2] = new SalariedEmployee("David", "SalariedEmployee", "134-98-4679",1500.0);
        staff[3] = new BasePlusCommisionEmployee("Rick", "BasePlusCommssionedEmployee", "208-67-3890",100.0, 20, 50000.0);

        for(Employee e : staff){
            System.out.println(e);  // or call the toString on it -  System.out.println(e.toString());
            System.out.println("This employee earned " + e.earnings());
            System.out.println("==================================================================================================================================================================================================");
        }

        //Get and display the type of employee
        for(int x = 0; x < staff.length; x++){
            System.out.println(staff[x].getClass().getSimpleName());
        }

        System.out.println("==================================================================================================================================================================================================");

        Invoice invoice = new Invoice("pn#123 ", "Basic Tool", 5, 10.0);
        System.out.println(invoice);
        System.out.println("JPMorgan owes vendor " + invoice.getPaymentAmount());
        System.out.println("JPMorgan owes employee " + staff[2].getPaymentAmount());
        System.out.println("==================================================================================================================================================================================================");

        for(Employee employee : staff){
            System.out.println("==================================================================================================================================================================================================");
            System.out.println(employee + "\ngetPaymentAmount : " +  employee.getPaymentAmount());
        }

        System.out.println("==================================================================================================================================================================================================");

        //Demo Instance Of

//        if(staff[3] instanceof CommissionEmployee){
//            System.out.println("BasePlusCommissioned Employee is a type of Commissioned employee");
//        }else {
//            System.out.println("They are not the same homie!!!");
//
//        }







        /*
        Research ==========

        //Downcasting - casting from a super class to a sub class
        CommissionEmployee commissionEmployee = new CommissionEmployee("kevin", "hart", "120-98-8907", 30, 100);

        if (commissionEmployee instanceof BasePlusCommisionEmployee){
            System.out.println(" Commissioned employee is a type of BasePlusCommissioned");
        }else{
            System.out.println("They are not the same but we can downcast it");
            BasePlusCommisionEmployee employee1 = (BasePlusCommisionEmployee) commissionEmployee;
            System.out.println("Successfully casted down " + employee1.getFirstName());
        }
         */





/*
        //Autoboxing
        int x, y;
        x = 5;
        ArrayList<Integer> box = new ArrayList<Integer>();
        box.add(x);
        y = box.get(0);
        System.out.println(y);


        Integer n  = 2;  // Boxing
        int a  = n;        // Unboxing
    */
        //What's happening behind the scenes is
        //Integer n  = Integer.valueOf(2);
        //int a  = n.intValue();

        //https://javacertificationroadmap.com/primitive-data-types-and-wrapper-classes/
        //http://www.java2s.com/Tutorials/Java/Java_Data_Type/0170__Java_Autoboxing_Unboxing.htm



    }

    }

