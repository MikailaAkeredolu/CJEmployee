package javabasics;

import java.util.Scanner;
import java.io.*;
import java.util.*;


/**
 * Created by makerofapps on 10/14/17.
 */
public class Main {

    //Declare a static scanner object
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        FirstClass myObject = new FirstClass("Mikaila", 39);
        System.out.println(myObject.printProps());
        //System.out.println("learning how to\nwrite java again");  // \n newline

        //Variables
        String firstName = "Mike";
        String lastName = "Jones";

        //String Format - printf
        System.out.printf("first name is %s and last name is %s\n",firstName,lastName);  //printf - string format
        System.out.printf("%s is leaning java\n", firstName);

        //More than one variable with formatted strings

        //User Input String and int
        // 1. Create a Scanner using the InputStream available.

        // 2. Don't forget to prompt the user
        System.out.print("Type a string below ...\n");
        // 3. Use the Scanner to read a line of text from the user.
        String input = scanner.nextLine();
        // 4. Now, you can do anything with the input string
        System.out.println("you entered - \n" + input);

        System.out.print("How old are you? ...\n");
        //String anotherInput = scanner.nextLine();
       // int numberInput = Integer.parseInt(anotherInput);
        int numberInput = scanner.nextInt();
        System.out.println("You entered\n" + numberInput);

        //ints and conditionals

        if( numberInput < 13){
            System.out.println("Sorry you are not old enough");
            System.exit(0);
        }else{
            System.out.println("You are good to go");
        }


        //Class string
        String cde = "cde";
        System.out.println("abc" + cde);
        //String c = "abccde".substring(4); //de //start at 4th index
        String c = "abccde".substring(3,5); //cd - start and 4th index end at 5 element
       // String d = cde.substring(1, 2);
        System.out.println("===========");
        System.out.println(c);
       // System.out.println(d);

        //String compare and ignore case - 	equalsIgnoreCase(String anotherString)  //returns boolean

    }
}
