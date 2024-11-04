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
    
}

