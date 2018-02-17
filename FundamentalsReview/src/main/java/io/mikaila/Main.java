package io.mikaila;

/**
 * Created by makerofapps on 12/19/17.
 */
public class Main {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for(int x = 0; x < 13; x++){
            System.out.println(myDeckOfCards.dealCards());
        }
    }
}
