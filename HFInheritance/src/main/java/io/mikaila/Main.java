package io.mikaila;

/**
 * Created by makerofapps on 12/18/17.
 */
public class Main {
    public static void main(String[] args) {
        Mammals mammalOne = new Monkey("Jojo", 10);
        //System.out.println(mammalOne.move());

        Mammals mammalTwo = new Bat("nikki", 3);
        System.out.println(mammalTwo.eat());

        Mammals[] animals = new Mammals[2];
        animals[0] = mammalOne;
        animals[1] = mammalTwo;

        for(Mammals m: animals){
            System.out.println(m.eat());
        }

        System.out.println("================================");
        //Inheritance

        Turtle turtle = new Turtle();
        System.out.println(turtle.walkSlow());
        System.out.println(turtle.beFriendly());

        Dog bucket = new Corgi("jackie", 2);
        System.out.println(bucket.wag());


        System.out.println(bucket.beFriendly());
        System.out.println("=============End of Inheritance===================");

        RoboDog roboDog = new RoboDog();
        System.out.println(roboDog.beFriendly());
        System.out.println(roboDog.play());
        System.out.println("=============End of Interface===================");

        Animal[] arrayOfAnimals = new Animal[3];

        arrayOfAnimals[0] = new Dog();
      //  System.out.println(" dogs "+ arrayOfAnimals[0].eat());

        arrayOfAnimals[1] = new Cat();
       // System.out.println(" cats "+ animalObjectTwo.eat());

        arrayOfAnimals[2] = new Tiger();
       // System.out.println(" tigers "+ animalObjectThree.eat());


        for(Animal a : arrayOfAnimals){
            System.out.println(a.eat());
        }

        System.out.println("=============End of Polymorphism===================");


    }
}
