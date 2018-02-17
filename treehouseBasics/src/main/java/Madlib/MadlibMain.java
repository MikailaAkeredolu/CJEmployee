package Madlib;
import java.awt.peer.SystemTrayPeer;
import java.util.*;
import java.io.*;
import java.util.Scanner;


/**
 * Created by makerofapps on 10/15/17.
 */
public class MadlibMain {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("How old are you? \n");
        String ageAsString = scanner.nextLine();
        int age = Integer.parseInt(ageAsString);

        if(age < 13){
            System.out.println("Sorry you must be 13 to use this program\n");
            System.exit(0);
        }

        System.out.print("What is your name? \n");
        String name = scanner.nextLine();

        System.out.print("Enter an adjective:  \n");
        String adjective = scanner.nextLine();

        String noun;
        boolean isInvalidWord;
        do{
            System.out.print("Enter an noun:  \n");
            noun = scanner.nextLine();
            isInvalidWord = noun.equalsIgnoreCase("dork") || (noun.equalsIgnoreCase("Jerk"));

            if(isInvalidWord) {
                System.out.println("That language is not allowed ..Try again\n");
               // System.exit(0);
            }

        }while((noun.equalsIgnoreCase("dork")) || (noun.equalsIgnoreCase("Jerk")));


        System.out.print("Enter an adverb:  \n");
        String adverb = scanner.nextLine();

        System.out.print("Enter an verb ending in -ing:  \n");
        String verb = scanner.nextLine();

        System.out.println("Here is Your Story : \n===========\n");
        System.out.printf("%s is a %s %s\n", name, adjective, noun);
        System.out.printf("They are always %s %s.\n", adverb, verb);

    }
}
