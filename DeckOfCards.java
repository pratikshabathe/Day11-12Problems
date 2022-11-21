package com.blz.day11_12;

public class DeckOfCards {

	public static void main(String[] args) {
		int[] deck = new int [52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6","7","8","9","10", "Jack", "Queen", "King"};
		
		//Initialize cards
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		//Shuffle the cards
		for(int i = 0; i < deck.length; i++) {
			int index =(int)(Math.random() * deck.length) ;
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] =temp;
		}
		
		//Display the all Cards
		for(int i = 0; i < 52; i++) {
			String suit = suits[deck [i] / 13];
			String rank = ranks[deck [i] / 13];
			System.out.println(rank + " of " + suit);
		}
		
		//print shuffled deck
		for(int i = 0; i < 4; i++) {
		//	System.out.println("** Person" + (i + 1) + " **");
			for(int j = 0; j < 9; j++) {
				System.out.println(deck[i + j * 4]);
			}
		}
	}
}
