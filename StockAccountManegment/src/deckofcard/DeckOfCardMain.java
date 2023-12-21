package deckofcard;

import java.util.List;

public class DeckOfCardMain {
	    public static void main(String[] args) {
	        DeckOfCards deckOfCards = new DeckOfCards();

	        String[][] playersCards = new String[4][9];

	        for (int i = 0; i < 4; i++) {
	            List<Card> hand = deckOfCards.dealCards(9);
	            for (int j = 0; j < 9; j++) {
	                if (j < hand.size()) {
	                    playersCards[i][j] = hand.get(j).toString();
	                } else {
	                    playersCards[i][j] = "Empty";
	                }
	            }
	        }
	        for (int i = 0; i < 4; i++) {
	            System.out.println("Player " + (i + 1) + " cards:");
	            for (int j = 0; j < 9; j++) {
	                System.out.print(playersCards[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}

