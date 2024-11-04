package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearths", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};

        for (String suit : suits) {
        }
        for (String value : values) {
        }
        Card card = new Card(suit, value);
        cards.add(card);
    }
    public shuffle() {
        Collection.shuffle(cards);
    }

    }
}


