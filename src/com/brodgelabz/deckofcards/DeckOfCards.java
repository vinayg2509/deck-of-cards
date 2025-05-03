package com.brodgelabz.deckofcards;
import java.util.*;
public class DeckOfCards
{
    public static void main(String[] args) {
        String [] suits={"Clubs","Diamonds","Hearts","Spades"};
        String [] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        // Initialize deck
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        // Shuffle the deck using Fisher-Yates algorithm
        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        // Distribute 9 cards to 4 players
        String[][] players = new String[4][9];
        int cardIndex = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                players[j][i] = deck[cardIndex++];
            }
        }

        // Print the cards received by each player
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}

