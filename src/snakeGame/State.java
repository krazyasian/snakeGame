package snakeGame;

import java.util.concurrent.*;

public class State{
	
	//An empty square in the grid
	public final static int EMPTY = 0;
	//An item of food in the grid which is collectible by the player
	public final static int FOOD = 1;
	//Part of a snake occupying the square in the grid
	public final static int SNAKE = 2;
	
	//Height of the grid to be set by the server
	public int gameHeight;
	//Width of the grid to be set by the server
	public int gameWidth;
	
	//Concurrent hash map containing key values and items at that location
	//String - The key for searching the grid in the format XX-XX where the integers before the "-" are the X coordinates
	//and the integers after the "-" are the Y coordinates.
	//Integer - The number representing what is at a particular location in the grid.
	ConcurrentHashMap<String, Integer> grid = new ConcurrentHashMap<String, Integer>();
	
	
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
				grid.put(key, 0);
			}
		}
	}
	
	//Returns a string informing what is contained at the given x and y coordinates.
	public String getGridLoc(int x, int y)
	{
		String key = x + "-" + y;
		int atLoc = grid.get(key);
		if(atLoc == 0)
		{
			return "EMPTY";
		}
		else if (atLoc == 1)
		{
			return "FOOD";
		}
		else if (atLoc == 2)
		{
			return "SNAKE";
		}
		
		return null;
	}
	
	//Sets the given location of coordinates x,y to String contains
	public void setGricLoc(int x, int y, String contains)
	{
		int putLoc = 0;
		if (contains == "SNAKE")
		{
			putLoc = 2;
		}
		else if (contains == "FOOD")
		{
			putLoc = 1;
		}
		String key = x + "-" + y;
		grid.replace(key, putLoc);
	}
	
	
}