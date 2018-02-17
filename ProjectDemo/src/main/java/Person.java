/**
 * Created by makerofapps on 11/20/17.
 */
public class Person {

    String[] nickNames;

    public Person(String[] nickNames){
        this.nickNames = nickNames;
    }

    public String printSports(String[] sports){
        String result ="";
        for(int x = 0; x < sports.length; x++){
           result += sports[x];
        }
        return result;
    }
}
