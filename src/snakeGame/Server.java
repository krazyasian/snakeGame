package snakeGame;

import java.util.HashMap;

public class Server {
	private Buffer buffer;
	private State gameState;
	private HashMap playerStates;
	
	//CONSTRUCTOR
	public Server () {
		
	}
	
	//pull moves from the buffer
	private Buffer getBuffer () {
		return buffer;
	}
	
	//notify the players to update their game state
	private void notifyPlayers () {
		
	}
	
	
	
	//updates the game interface with the new moves coming from the players
	private synchronized void updateGameInterface () {
		//
		
	}
	
	private synchronized Thread addThread () {
		return new Thread();
	}
	
	
	private synchronized void removePlayer (Player removePlayer) {
		playerStates.remove(removePlayer);
	}
	
	//verify login player
	private synchronized boolean login (Player loginPlayer) {
		if (loginPlayer != null) {
			return true;
		}
		
		return false;
	}

}
