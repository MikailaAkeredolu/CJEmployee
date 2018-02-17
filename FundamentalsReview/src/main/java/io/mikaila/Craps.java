package io.mikaila;
import java.util.Random;

/**
 * Created by makerofapps on 12/19/17.
 */

public class Craps {

    private Random randomNumbers = new Random();

    private enum Status{
        CONTINUE, WON, LOST
    }


    private final static int SNAKE_EYES = 2;
    private final static int TREY = 3;
    private final static int SEVEN = 7;
    private final static int YO_ELEVEN = 11;
    private final static int BOX_CARS = 12;

    public void play(){
        int myPoint = 0;
        Status gameSattus;

        int sumOfDice = rollDice();

        switch (sumOfDice){
            case SEVEN:
            case YO_ELEVEN:
                gameSattus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameSattus = Status.LOST;
                break;
              default:
                  gameSattus = Status.CONTINUE;
                  myPoint = sumOfDice;
                  System.out.println("point is " + myPoint);
                  break;
        }

        while(gameSattus == Status.CONTINUE){
            sumOfDice = rollDice();

            if(sumOfDice == myPoint)
                gameSattus = Status.WON;
            else if (sumOfDice == SEVEN)
                gameSattus = Status.LOST;

        }

        if(gameSattus == Status.WON)
            System.out.println("Player Wins");
        else
            System.out.println("Player loses");

    }

    public int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6); //first die roll
        int die2 = 1 + randomNumbers.nextInt(6); //second die roll
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
        return sum;
    }

    public static void main(String[] args) {
    Craps game = new Craps();
    game.play();
    }

}














//Primitive types and casting what they can be promoted up to

/*
double =  none

float = (double)

long = (float or double)

int = (long, float or double)

char = (int , long, float or double)

short = (int , long, float or double BUT not char)

byte =  (short int , long, float or double BUT not char)

boolean  = None
 */



//Force conversion
//If method does not affect the state of an object then make it static
//Applies to the class as a whole instead of the object
//All methods of the Math class are static
//Static fields are variables declared with static variables when declared with final it means the field should not change