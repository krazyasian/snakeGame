package snakeGame;

public class Main {
static Boolean existed = false;
	public static void main(String[] args) {
			
				System.out.println("Checking if Login details matches with"
						+ " the database :) + IF TRUE then Start State");
				
				//****TODO change this one to true after checking with the database
				existed = true;
		
		
				System.out.println("Creating Player");
				for(int i=0;i<100;i++)
				{
					Thread p=new Thread(new Player("P"));
				}
				Player p=new Player("P1");
				System.out.println("Starting Game");
				State g=new State();
				g.initGame();
				g.init();
				
				//** TODO :- Pass Moves to G here
			}

}
