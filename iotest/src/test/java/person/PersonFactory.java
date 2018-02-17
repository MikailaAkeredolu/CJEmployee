package person;
import ThreadLocalRandom;


/**
 * Created by makerofapps on 7/24/17.
 */
public class PersonFactory {

     public static Person createPerson(){

         String name = Rand.createString('A','Z',7);
         int age = Rand.createInt(0, 100);
         Person randomPerson = new Person(name, age);
         return randomPerson;
     }

     public int createInt(int min, int max){
         int randVal = ThreadLocalRandom.current().nextInt(min, max);
         return randVal;
     }

}
