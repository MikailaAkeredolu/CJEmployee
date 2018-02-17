package Pez;

/**
 * Created by makerofapps on 10/15/17.
 */

public class PezDispenser {

    //Field or Member variables
    private String characterName;
    public int age;

    //Constructor
    public PezDispenser(String characterName, int age){
        this.characterName = characterName;
        this.age = age;
    }

    //Getter
    public String getCharacterName(){
        return this.characterName;
    }

    //Setter
    public void setCharacterName(String value){
        this.characterName = value;
    }

    //Method
    public String customPez(){
        return "Here is your custom pez";
    }





}
