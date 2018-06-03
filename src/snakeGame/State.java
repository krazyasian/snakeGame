package snakeGame;

import java.util.HashMap;
import java.util.concurrent.*;

public class State{
	
	//Height of the grid to be set by the server
	public int gameHeight;
	//Width of the grid to be set by the server
	public int gameWidth;
	
	ConcurrentHashMap<String, Location> grid = new ConcurrentHashMap<String, Location>();
	
	
	//Starting constructor for creating a completely blank grid.
	public State(int gameHeight, int gameWidth)
	{
		this.gameHeight = gameHeight;
		this.gameWidth = gameWidth;
		
		for (int i=0; i<gameHeight; i++ )
		{
			for (int j=0; j<gameWidth; j++)
			{
				String key = i + "-" + j;
				Location current = new Location(i, j, Location.atLocation.EMPTY);
				grid.put(key, current);
			}
		}
	}
	
	
	public Location getGridLoc(int x, int y)
	{
		String key = x + "-" + y;
		Location atLoc = grid.get(key);
		return atLoc;
		
	}
	
	public void setGricLoc(int x, int y, Location.atLocation contains)
	{
		Location current = new Location(x, y, contains);
		String key = x + "-" + y;
		grid.replace(key, current);
	}
	
	
}