package snakeGame;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentNavigableMap;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.Utils;

public class Server {
	private Buffer buffer;
	private State gameState;
	private HashMap playerStates;
	File dbFile = Utils.tempDbFile();
    DB db = DBMaker.newFileDB(dbFile)
            .closeOnJvmShutdown()
            .encryptionEnable("password")
            .make();

    //open an collection, TreeMap has better performance then HashMap
    ConcurrentNavigableMap<Integer,String> map = db.getTreeMap("collectionName");
	
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

	
	public void LoginData()
	{
        
        for(int i=0;i<100;i++)
        {
        map.put(i,"Player"+i);
        }
        //map.keySet() is now [1,2] even before commit

        db.commit();  //persist changes into disk

        //map.keySet() is now [1,2,3]
        db.rollback(); //revert recent changes
        //map.keySet() is now [1,2]
        System.out.println(map.get(1));
        
        db.close();
	}
}
