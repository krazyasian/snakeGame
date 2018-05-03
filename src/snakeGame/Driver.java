package snakeGame;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver extends JFrame {

	Driver() {
		JLabel players = new JLabel();
		players.setText("Number of players:");
		players.setFont(new Font("Courier New", Font.BOLD, 20));
		players.setBounds(170, 10, 400, 20);

		JLabel aI = new JLabel();
		aI.setText("Number of computer players (MAX 100):");
		aI.setFont(new Font("Courier New", Font.BOLD, 20));
		aI.setBounds(70, 80, 500, 20);

		JRadioButton onePlayer = new JRadioButton("1");
		onePlayer.setBounds(180, 40, 50, 20);

		JRadioButton twoPlayer = new JRadioButton("2");
		twoPlayer.setBounds(230, 40, 50, 20);

		JRadioButton threePlayer = new JRadioButton("3");
		threePlayer.setBounds(280, 40, 50, 20);

		JRadioButton fourPlayer = new JRadioButton("4");
		fourPlayer.setBounds(330, 40, 50, 20);

		ButtonGroup numPlayers = new ButtonGroup();
		numPlayers.add(onePlayer);
		numPlayers.add(twoPlayer);
		numPlayers.add(threePlayer);
		numPlayers.add(fourPlayer);

		JTextArea numAI = new JTextArea();
		numAI.setColumns(3);
		numAI.setBounds(260, 110, 50, 20);

		JButton start = new JButton("Start");
		start.setBounds(180, 200, 200, 100);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int totalPlayers = 0;
				if (onePlayer.isSelected()) {
					totalPlayers = 1;
				} else if (twoPlayer.isSelected()) {
					totalPlayers = 2;
				} else if (threePlayer.isSelected()) {
					totalPlayers = 3;
				} else if (fourPlayer.isSelected()) {
					totalPlayers = 4;
				}

				for (int i = 1; i < totalPlayers + 1; i++) {
					JFrame playerFrame = new JFrame();
					playerFrame.setSize(600, 400);

					JLabel username = new JLabel();
					username.setText("Username: ");
					username.setFont(new Font("Courier New", Font.BOLD, 20));
					username.setBounds(100, 20, 200, 20);

					JLabel password = new JLabel();
					password.setText("Password: ");
					password.setFont(new Font("Courier New", Font.BOLD, 20));
					password.setBounds(100, 100, 200, 20);

					JTextArea userField = new JTextArea();
					userField.setColumns(20);
					userField.setBounds(225, 22, 200, 20);

					JTextArea passField = new JTextArea();
					passField.setColumns(20);
					passField.setBounds(225, 102, 200, 20);

					JButton login = new JButton("Login");
					login.setBounds(100, 210, 75, 50);
					login.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							playerFrame.setVisible(false);
							JFrame gameScreen = new JFrame();
							gameScreen.setSize(600, 400);

							JLabel waiting = new JLabel();
							waiting.setText("Waiting for other players... ");
							waiting.setFont(new Font("Courier New", Font.BOLD, 20));
							waiting.setBounds(125, 100, 400, 20);

							gameScreen.add(waiting);
							gameScreen.setLayout(null);
							gameScreen.setVisible(true);
						}
					});

					playerFrame.add(username);
					playerFrame.add(password);
					playerFrame.add(userField);
					playerFrame.add(passField);
					playerFrame.add(login);

					playerFrame.setLayout(null);
					playerFrame.setVisible(true);
					if (i == 1) {
						playerFrame.setLocation(0, 0);
						playerFrame.setTitle("Player 1 Login");
					}
					if (i == 2) {
						playerFrame.setLocation(600, 0);
						playerFrame.setTitle("Player 2 Login");
					}
					if (i == 3) {
						playerFrame.setLocation(0, 400);
						playerFrame.setTitle("Player 3 Login");
					}
					if (i == 4) {
						playerFrame.setLocation(600, 400);
						playerFrame.setTitle("Player 4 Login");
					}

				}
			}
		});

		this.setSize(600, 400);
		this.setLayout(null);

		this.add(players);
		this.add(onePlayer);
		this.add(twoPlayer);
		this.add(threePlayer);
		this.add(fourPlayer);
		onePlayer.setSelected(true);

		this.add(aI);
		this.add(numAI);

		this.add(start);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		Driver j = new Driver();
	}

}
