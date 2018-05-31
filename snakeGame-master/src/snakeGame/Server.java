package snakeGame;

import java.nio.Buffer;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
	private ConcurrentHashMap<Player, Thread> players =
			new ConcurrentHashMap<Player,Thread>(4);
	private Buffer concurrentBuffer;
	private GameInterface game;
	
	//CONSTRUCTOR
	public Server () {
		
	}
	
	public ConcurrentHashMap<Player, Thread> getPlayers() {
		return players;
	}
	
	//pull moves from the buffer
	public Buffer getBuffer () {
		return concurrentBuffer;
	}
	
	//notify the players to update their game state
	public void notifyPlayers () {
		
	}
	
	//updates the game interface with the new moves coming from the players
	public synchronized void updateGameInterface () {
		//
		
	}
	
	public synchronized Thread addThread () {
		return new Thread();
	}
	
	public void addPlayer () {
		players.put(new Player(), addThread());
	}
	
	public synchronized void removePlayer (Player removePlayer) {
		players.remove(removePlayer);
	}
	
	//verify login player
	public synchronized boolean login (Player loginPlayer) {
		if (loginPlayer(loginPlayer)) {
			return true;
		}
		
		return false;
	}
	
	//verify player login
	public synchronized boolean loginPlayer (Player loginPlayer) {
			
			
		return false;
	}

	
}
