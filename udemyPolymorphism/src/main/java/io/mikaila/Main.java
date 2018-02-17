package io.mikaila;

import java.util.*;

/**
 * Created by makerofapps on 11/21/17.
 */

//Movies class
class Movie{

    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName(){
        return name;
    }
}




//Jaws - class

class Jaws extends Movie{
    public Jaws(){

        super("Jaws");
    }

    @Override
    public String plot(){

        return "A shark eats lots of people";
    }
}





// IndependenceDay - class

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over earth";
    }
}





//MazeRunner

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}



//Star wars

    class Starwars extends Movie {
        public Starwars() {
            super("Star Wars");

        }

        @Override
        public String plot() {
            return "Imperial forces try to take over universe";
        }

    }

//Forgetable

    class ForgetableMovie extends Movie {
        public ForgetableMovie() {
            super("Forgetable");
        }
        //No plot method
    }






//Main Class with a main inside to run the code

public class Main {

    public static void main(String[] args) {
   //Loop through get a random movie

        for(int x = 1; x < 11; x++ ){
            Movie movie = randomMovie();
            System.out.println("Movie # " + x +
                    ": " + movie.getName() + "\n" +
            "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1;  //cast-convert to integer and return a number btw 1 nd 5
        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
                //break; - not needed because of the return
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new ForgetableMovie();

        }
        return null;
    }
}

