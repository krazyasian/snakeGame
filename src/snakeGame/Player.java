package snakeGame;

import java.awt.event.KeyEvent;

public class Player implements Runnable {
	
	public String PlayerName = "PlayerName";
	
	public Player(String PlayerName) {
		this.PlayerName  = PlayerName;
		resetLastKeyPressed();
	}

	public static enum Move {
		UP, DOWN, LEFT, RIGHT, NONE;
	}
	
	Move lastKeyPressed = null;
	
	private int upKey = 0, downKey = 1, leftKey = 2, rightKey = 3;

	public void run()
	{
		System.out.println("new player created");
	}

	public void keyPressed(KeyEvent arg0) {
		int key = arg0.getKeyCode();
		
		if (key == KeyEvent.VK_UP) {
			setLastKeyPressed(Move.UP);
		} else if(key == KeyEvent.VK_DOWN) {
			setLastKeyPressed(Move.DOWN);
		} else if(key == KeyEvent.VK_LEFT) {
			setLastKeyPressed(Move.LEFT);
		} else if(key == KeyEvent.VK_RIGHT) {
			setLastKeyPressed(Move.RIGHT);
		}
	}
	
	//Getters and Setters
	public Move getLastKeyPressed() {
		System.out.println(lastKeyPressed.toString());
		return lastKeyPressed;
	}
	public void setLastKeyPressed(Move input) {
		lastKeyPressed = input;
	}
	public void resetLastKeyPressed() {
		lastKeyPressed = Move.NONE;
	}
	
	public int getUpKey() {
		return upKey;
	}
	public void setUpKey(int upKey) {
		this.upKey = upKey;
	}

	public int getDownKey() {
		return downKey;
	}
	public void setDownKey(int downKey) {
		this.downKey = downKey;
	}

	public int getLeftKey() {
		return leftKey;
	}
	public void setLeftKey(int leftKey) {
		this.leftKey = leftKey;
	}

	public int getRightKey() {
		return rightKey;
	}
	public void setRightKey(int rightKey) {
		this.rightKey = rightKey;
	}
}