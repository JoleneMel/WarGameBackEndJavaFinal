package gamePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	
//	Deck
//	Fields
//	cards (List of Card)
	private List<Card> cards = new ArrayList<Card>();
	
//	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	public Deck() {
				Map<Integer, String> cardValueMap = new HashMap<Integer, String>();
						cardValueMap.put(2, "2");
						cardValueMap.put(3, "3");
						cardValueMap.put(4, "4");
						cardValueMap.put(5, "5");
						cardValueMap.put(6, "6");
						cardValueMap.put(7, "7");
						cardValueMap.put(8, "8");
						cardValueMap.put(9, "9");
						cardValueMap.put(10, "10");
						cardValueMap.put(11, "J");
						cardValueMap.put(12, "Q");
						cardValueMap.put(13, "K");
						cardValueMap.put(14, "A");
		//to make each suit 		
		for (int i = 2; i <= 14; i++) {
			 Card card = new Card();
			 card.setSuit(Suit.HEART);
			 card.setValue(i);
			 cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			 Card card = new Card();
			 card.setSuit(Suit.SPADE);
			 card.setValue(i);
			 cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			 Card card = new Card();
			 card.setSuit(Suit.DIAMOND);
			 card.setValue(i);
			 cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			 Card card = new Card();
			 card.setSuit(Suit.CLUB);
			 card.setValue(i);
			 cards.add(card);
		}
	}
		
	//	Methods
	//	shuffle (randomizes the order of the cards)
		public void shuffle() {
			//to shuffle cards 
			Collections.shuffle(cards);
		}
		
		
	//	draw (removes and returns the top card of the Cards field)
	public Card draw() {
		return cards.remove(0); //then removes top card?
	}


}
