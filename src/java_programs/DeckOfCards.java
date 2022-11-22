package java_programs;

import java.util.Arrays;

public class DeckOfCards {

	public static void main(String[] args) {
		
		int[] deck = new int[52];
		
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
							"Jack", "Queen", "King"};
		
		//initialize a deck
		for(int i = 0; i<deck.length; i++)
		{
			deck[i] = i;
		}
		System.out.println(Arrays.toString(deck));
		
		//shuffle a deck
		for(int i=0; i < deck.length; i++)
		{
			int shuffledCard = (int) (Math.random() * deck.length);
			int temp = deck[0];
			deck[0] = deck[shuffledCard];
			deck[shuffledCard] = temp;
		}
		System.out.println(Arrays.toString(deck));
		
		//display first four cards
		for (int i = 0; i < 4; i++)
		{
			int card = deck[i];
			String cardSuits = suits[card/13];
			String cardRank = ranks[card%13];
			System.out.println("The card selected is " + card + " : " + cardRank + " of " + cardSuits  );
		}
			
	}

}
