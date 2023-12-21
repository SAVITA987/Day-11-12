package deckofcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DeckOfCards {
	    private List<Card> deck;

	    public DeckOfCards() {
	        initializeDeck();
	        shuffleDeck();
	    }

	    private void initializeDeck() {
	        deck = new ArrayList<>();
	        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

	        for (String suit : suits) {
	            for (String rank : ranks) {
	                deck.add(new Card(suit, rank));
	            }
	        }
	    }

	    private void shuffleDeck() {
	        Collections.shuffle(deck, new Random());
	    }

	    public List<Card> dealCards(int numCards) {
	        List<Card> hand = new ArrayList<>();

	        for (int i = 0; i < numCards; i++) {
	            if (!deck.isEmpty()) {
	                hand.add(deck.remove(0));
	            }
	        }

	        return hand;
	    }
	}

