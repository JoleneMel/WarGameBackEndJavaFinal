package gamePackage;

public class App {

	public static void main(String[] args) {
//		Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player();
		player1.setName("Player1");
		Player player2 = new Player();
		player2.setName("Player2");
		
//		Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
				}
			else {
			player2.draw(deck);
			}
		}
	
//		Using a traditional for loop, iterate 26 times and call the flip method for each player.
		int round = 1;
		for (int i = 0; i < 26; i++) {
			//this is all to make it pretty
			System.out.println("=============================================");
			System.out.println("---------------------------------------------");
			System.out.println("\t[ Round: " + round + " ]");
			Card card1 = player1.flip();
			player1.describe(card1);
			System.out.println(" vs. " );
			System.out.print(" \t ");
			Card card2 = player2.flip();
			player2.describe(card2);
			System.out.println();
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " has gained a point, total points " + player1.getScore());
				System.out.println("---------------------------------------------");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " has gained a point, total points " + player2.getScore());
				System.out.println("---------------------------------------------");
			} else {
				System.out.println("The two players have tied! No points awarded!");
			}
			round += 1;
		}
	
		
//		After the loop, compare the final score from each player. 
//		Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
			System.out.println("_____________________________________________");
			System.out.println("\t {[RESULTS!!!]}");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " with a score of: " + player1.getScore() + " has won, compared \nto " + player2.getName() 
		+ " score: " + player2.getScore());
		} else if(player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " with a score of: " + player2.getScore() + " has won, compared \nto " + player1.getName() 
		+ " score: " + player1.getScore()); 
		} else {
			System.out.println(player1.getName() + " and " + player2.getName() + " have tied with scores " + player1.getScore());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		

	}

}
