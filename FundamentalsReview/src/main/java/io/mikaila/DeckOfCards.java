package io.mikaila;

import java.util.Random;

/**
 * Created by makerofapps on 12/19/17.
 */
public class DeckOfCards {
    private Card deck[]; //Array of card objects
    private int currentCard; //index of current card
    private final int NUMBER_OF_CARDS = 52;  //constant number of cards
    private Random randomNumbers; //random number generator


    //Constructor to fill deck of cards
    public DeckOfCards() {

        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; //create an array of card objects (52)
        currentCard = 0;
        randomNumbers = new Random();

        //Populate deck with card objects
        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
            //first 13 cards will be ace through king of hearts then ace though king of diamonds etc...

        }

    }

    //Shuffle deck of cards with one -pass algorithm
    public void shuffle(){
        //After shuffling dealing starts at deck[0] again
        currentCard = 0;
        //for each card , pick another random card and swap them
        for(int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //Swap Method to swap current card with randomly selected card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //deal one card
    public Card dealCards(){
        //determine wheather cards remain to be dealt
        if(currentCard < deck.length){
            //return current card in array
            return deck[currentCard++];
        }
        return null;
    }
}
