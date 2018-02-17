package io.mikaila;

/**
 * Created by makerofapps on 11/21/17.
 */
public class Player {

    public String fullName;
    public int health;
    public String weapon;


    //Methods
    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            //reduce number of lives remaining for player
        }

    }

    public int healthRemaining(){
        return this.health;

    }

}
