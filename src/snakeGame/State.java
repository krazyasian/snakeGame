package snakeGame;

import java.util.concurrent.*;

public class State{
	
	public final static int EMPTY = 0;
	public final static int FOOD = 1;
	public final static int SNAKE = 2;
	public int gameHeight;
	public int gameWidth;
	ConcurrentHashMap<String, Integer> grid = new ConcurrentHashMap<String, Integer>();
	
	
	
	public State(int gameHeight, int gameWidth)
	{
		this.gameHeight = gameHeight;
		this.gameWidth = gameWidth;
		
		for (int i=0; i<gameHeight; i++ )
		{
			for (int j=0; j<gameWidth; j++)
			{
				String key = i + "0" + j;
				grid.put(key, 0);
			}
		}
	}
	
	public int getGridLoc(int x, int y)
	{
		String key = x + "0" + y;
		return grid.get(key);
	}
	
	public void setGricLoc(int x, int y, int contains)
	{
		String key = x + "0" + y;
		grid.replace(key, contains);
	}
	
	
}