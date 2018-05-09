package snakeGame;

public class main {

	public static void main(String[] args) {
			Boolean existed = false;
				System.out.println("Checking if Login details matches with"
						+ " the database :) + IF TRUE then Start GameState");
				
				//change this one to true after checking with the database
				existed = true;
				System.out.println("Creating Player");
				Player p=new Player("P1");
				System.out.println("Starting Game");
				GameState g=new GameState();
				g.initGame();
				
				//** TODO :- Pass Moves to G here
			}

}
