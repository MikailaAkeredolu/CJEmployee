package io.mikaila;

/**
 * Created by makerofapps on 11/21/17.
 */
public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Mike";
//        player.health = 20;
//        player.weapon = "sword";

        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("tim", 250, "Axe");
        System.out.println("initial health is " + enhancedPlayer.getHealth());
        enhancedPlayer.loseHealth(damage);
        System.out.println(enhancedPlayer.getHealth());
       // System.out.println("remaining health = " + enhancedPlayer.healthRemaining());


    }
}
