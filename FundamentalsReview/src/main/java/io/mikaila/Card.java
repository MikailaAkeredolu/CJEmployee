package io.mikaila;

/**
 * Created by makerofapps on 12/19/17.
 */
public class Card {
    private String face;
    private String suit;

    public Card(String face, String suit){
        this.face = face;
        this.suit = suit;

    }


    @Override
    public String toString(){
        return face + " of " + suit;
    }
}
