package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value, boolean isFaceUp) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = isFaceUp;
    }

    public String getSuit(){
        if(isFaceUp){
            return  suit;
        }else {
            return "#";
        }
    }
    public String getValue() {
        // only return the value if the card is face up
        if (isFaceUp) {
            // this is the string value of the card
            // i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }
}

