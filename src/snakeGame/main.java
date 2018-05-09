package snakeGame;

public class main {
static Boolean existed = false;
	public static void main(String[] args) {
			
				System.out.println("Checking if Login details matches with"
						+ " the database :) + IF TRUE then Start GameState");
				
				//****TODO change this one to true after checking with the database
				existed = true;
		
		
				System.out.println("Creating Player");
				Player p=new Player("P1");
				System.out.println("Starting Game");
				GameState g=new GameState();
				g.initGame();
				
				//** TODO :- Pass Moves to G here
			}

}
