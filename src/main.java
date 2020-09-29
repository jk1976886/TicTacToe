import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class main {
	public static int[][] map;
	public static int curPlayer = 1;
	public static int win = -1;
	public static JFrame frame;
	public static JPanel windowPanel;
	public static JLabel playerTurn;

	public static void main(String[] args) {
		init(true);
	}

	public static void init(boolean first) {
		map = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				map[i][j] = 0;
			}
		}
		curPlayer = 1;
		win = -1;

		frame = new JFrame("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 550);

		JLabel player1 = new JLabel("X");
		player1.setFont(new Font(player1.getFont().getName(), Font.PLAIN, 40));
		JLabel player2 = new JLabel("O");
		player2.setFont(new Font(player2.getFont().getName(), Font.PLAIN, 40));

		playerTurn = new JLabel("X's turn", SwingConstants.CENTER);
		playerTurn.setFont(new Font(playerTurn.getFont().getName(), Font.PLAIN, 50));

		JPanel gameMainPanel = new JPanel();
		gameMainPanel.setLayout(new GridLayout(3, 3));

		GridLayout grid = new GridLayout(1, 1);

		JPanel innerPanel1 = new JPanel();
		innerPanel1.setLayout(grid);
		JPanel innerPanel2 = new JPanel();
		innerPanel2.setLayout(grid);
		JPanel innerPanel3 = new JPanel();
		innerPanel3.setLayout(grid);
		JPanel innerPanel4 = new JPanel();
		innerPanel4.setLayout(grid);
		JPanel innerPanel5 = new JPanel();
		innerPanel5.setLayout(grid);
		JPanel innerPanel6 = new JPanel();
		innerPanel6.setLayout(grid);
		JPanel innerPanel7 = new JPanel();
		innerPanel7.setLayout(grid);
		JPanel innerPanel8 = new JPanel();
		innerPanel8.setLayout(grid);
		JPanel innerPanel9 = new JPanel();
		innerPanel9.setLayout(grid);

		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();
		JButton btn6 = new JButton();
		JButton btn7 = new JButton();
		JButton btn8 = new JButton();
		JButton btn9 = new JButton();

		ActionListener btnClicked = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				int num = Integer.parseInt(cmd);
				JLabel player = player1;
				if (curPlayer == 1) {
					player = player1;
				} else {
					player = player2;
				}
				if (num == 1) {
					btn1.setVisible(false);
					innerPanel1.add(player);
					
					map[0][0] = curPlayer;
				} else if (num == 2) {
					btn2.setVisible(false);
					innerPanel2.add(player);
					map[0][1] = curPlayer;
				} else if (num == 3) {
					btn3.setVisible(false);
					innerPanel3.add(player);
					map[0][2] = curPlayer;
				} else if (num == 4) {
					btn4.setVisible(false);
					innerPanel4.add(player);
					map[1][0] = curPlayer;
				} else if (num == 5) {
					btn5.setVisible(false);
					innerPanel5.add(player);
					map[1][1] = curPlayer;
				} else if (num == 6) {
					btn6.setVisible(false);
					innerPanel6.add(player);
					map[1][2] = curPlayer;
				} else if (num == 7) {
					btn7.setVisible(false);
					innerPanel7.add(player);
					map[2][0] = curPlayer;
				} else if (num == 8) {
					btn8.setVisible(false);
					innerPanel8.add(player);
					map[2][1] = curPlayer;
				} else if (num == 9) {
					btn9.setVisible(false);
					innerPanel9.add(player);
					map[2][2] = curPlayer;
				}

				if (curPlayer == 1) {
					curPlayer = 2;
					playerTurn.setText("O's turn");
				} else {
					curPlayer = 1;
					playerTurn.setText("X's turn");
				}

			}
		};

		btn1.setActionCommand("1");
		btn2.setActionCommand("2");
		btn3.setActionCommand("3");
		btn4.setActionCommand("4");
		btn5.setActionCommand("5");
		btn6.setActionCommand("6");
		btn7.setActionCommand("7");
		btn8.setActionCommand("8");
		btn9.setActionCommand("9");

		btn1.addActionListener(btnClicked);
		btn2.addActionListener(btnClicked);
		btn3.addActionListener(btnClicked);
		btn4.addActionListener(btnClicked);
		btn5.addActionListener(btnClicked);
		btn6.addActionListener(btnClicked);
		btn7.addActionListener(btnClicked);
		btn8.addActionListener(btnClicked);
		btn9.addActionListener(btnClicked);

		innerPanel1.add(btn1);
		innerPanel2.add(btn2);
		innerPanel3.add(btn3);
		innerPanel4.add(btn4);
		innerPanel5.add(btn5);
		innerPanel6.add(btn6);
		innerPanel7.add(btn7);
		innerPanel8.add(btn8);
		innerPanel9.add(btn9);

		innerPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		innerPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		innerPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		innerPanel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		innerPanel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		innerPanel6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		innerPanel7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		innerPanel8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		innerPanel9.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		gameMainPanel.add(innerPanel1);
		gameMainPanel.add(innerPanel2);
		gameMainPanel.add(innerPanel3);
		gameMainPanel.add(innerPanel4);
		gameMainPanel.add(innerPanel5);
		gameMainPanel.add(innerPanel6);
		gameMainPanel.add(innerPanel7);
		gameMainPanel.add(innerPanel8);
		gameMainPanel.add(innerPanel9);

		windowPanel = new JPanel();
		windowPanel.setLayout(new BorderLayout());
		windowPanel.add(gameMainPanel, BorderLayout.CENTER);

		windowPanel.add(playerTurn, BorderLayout.NORTH);

		frame.add(windowPanel);
		frame.setVisible(true);

		if (first) {
			intro();
		}

		game();
	}

	public static void intro() {
		int play = JOptionPane.showConfirmDialog(frame, "Welcome to TicTacToe! Do you want to start a new game?",
				"Welcome!", JOptionPane.YES_NO_OPTION);
		if (play == JOptionPane.YES_OPTION) {
			game();
		} else {
			System.exit(0);
		}
	}

	public static void game() {
		// game starts
		while (true) {
			checkWin();
			if (win != -1) {
				// game ended
				gameOver();
			}
		}
	}

	public static void gameOver() {
		playerTurn.setText("Game Over!");
		String text = "";
		if (win == 1) {
			text = "X win! Do you want to play again?";
		} else if (win == 2) {
			text = "O win! Do you want to play again?";
		} else if (win == 3) {
			text = "Draw! Do you want to play again?";
		}
		int replay = JOptionPane.showConfirmDialog(frame, text, "Game Ended", JOptionPane.YES_NO_OPTION);
		if (replay == JOptionPane.YES_OPTION) {
			frame.setVisible(false);
			frame.dispose();
			init(false);
		} else {
			System.exit(0);
		}
	}

	public static void checkWin() {
		// check lines
		if (map[0][0] == map[0][1] && map[0][1] == map[0][2] && map[0][2] != 0) {
			win = map[0][2];
		} else if (map[1][0] == map[1][1] && map[1][1] == map[1][2] && map[1][2] != 0) {
			win = map[1][2];
		} else if (map[2][0] == map[2][1] && map[2][1] == map[2][2] && map[2][2] != 0) {
			win = map[2][2];
		} else if (map[0][0] == map[1][0] && map[1][0] == map[2][0] && map[2][0] != 0) {
			win = map[2][0];
		} else if (map[0][1] == map[1][1] && map[1][1] == map[2][1] && map[2][1] != 0) {
			win = map[2][1];
		} else if (map[0][2] == map[1][2] && map[1][2] == map[2][2] && map[2][2] != 0) {
			win = map[2][2];
		} else if (map[0][0] == map[1][1] && map[1][1] == map[2][2] && map[2][2] != 0) {
			win = map[2][2];
		} else if (map[0][2] == map[1][1] && map[1][1] == map[2][0] && map[2][0] != 0) {
			win = map[2][0];
		} else {
			int counter = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (map[i][j] != 0) {
						counter++;
					}
				}
			}

			if (counter == 9) {
				win = 3;
			} else {
				// no winner
				win = -1;
			}
		}
	}
}
