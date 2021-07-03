package gamePackage;

import java.util.ArrayList;
import java.util.List;
//import java.util.Map;

public class Player {
//	Player
//	Fields
//	hand (List of Card)
//	score (set to 0 in the constructor)
//	name
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	public Player() {} //to have multiple constructors 
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
//	Methods
//	describe (prints out information about the player 
//  and calls the describe method for each card in the Hand List)
	public void describe(Card card) {
		System.out.print(this.name + " plays: " + card.describe());
	}

	
//	flip (removes and returns the top card of the Hand)
	public Card flip() {
		return hand.remove(0);
	} 
	
	
//	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	public void draw(Deck deck) {
		hand.add(deck.draw());
}
	
	//incrementScore (adds 1 to the Player’s score field)
	public int incrementScore() {
		return this.score +=1;
	}
	
	//GETTERS AND SETTERS
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	

}
