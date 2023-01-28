/**
 @author cvstunner
**/

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends JFrame {
	// Instances of Swing Components & Global Variables
	JPanel toss_panel = new JPanel();
	JPanel player1_panel = new JPanel();
	JPanel player1_sub_panel = new JPanel(); 
	JPanel main_panel = new JPanel();
	JPanel game_panel = new JPanel();
	JPanel player2_panel = new JPanel(); 
	JPanel player2_sub_panel = new JPanel(); 
	JPanel choice_panel = new JPanel();
	JPanel win_panel = new JPanel();
	JPanel choice_sub1_panel = new JPanel();
	JPanel choice_sub2_panel = new JPanel();
	JPanel win_sub1_panel = new JPanel();
	JPanel win_sub2_panel = new JPanel();
	JPanel win_sub3_panel = new JPanel();
	JLabel player1_label = new JLabel("Player 1");
	JLabel player2_label = new JLabel("Player 2");
	JLabel toss_win_player = new JLabel();
	JLabel choice_OR_label = new JLabel(" OR ");
	JLabel game_win_player = new JLabel("Player 1 Wins!");
	JLabel cntnu_dialogue = new JLabel("Continue Playing?");
	JLabel win_space_label = new JLabel("  ");
	JLabel player1_symbol = new JLabel();
	JLabel player2_symbol = new JLabel();
	JButton toss_btn = new JButton("Toss");
	JButton game_btns[] = new JButton[9];
	JButton yes_btn = new JButton("Yes");
	JButton no_btn = new JButton("No");
	JButton choice_X_btn = new JButton("X");
	JButton choice_O_btn = new JButton("O");
	boolean player1_turn;
	String player1_choice = "";
	String player2_choice = "";
	boolean isGameEnded = false;
	boolean isGameDraw = false;
	int turnCount = 0;

	// Public Class Constructor
	public  Main(){
		init();
	}

	// Graphical Interface
	private void init(){
		SpringLayout spg_layout = new SpringLayout();
		toss_panel.setBackground(new Color(120, 190, 170));
		toss_panel.setBounds(192, 274, 200, 150);
		toss_panel.setLayout(spg_layout);
		add(toss_panel);

		choice_panel.setBounds(192, 274, 200, 150);
		choice_panel.setLayout(new BoxLayout(choice_panel, BoxLayout.PAGE_AXIS));
		choice_panel.setVisible(false);
		add(choice_panel);

		win_panel.setBackground(new Color(170, 120, 170));
		win_panel.setBounds(167, 262, 250, 175);
		win_panel.setLayout(new BoxLayout(win_panel, BoxLayout.PAGE_AXIS));
		win_panel.setVisible(false);
		add(win_panel);

		win_sub1_panel.setMaximumSize(new Dimension(250, 50));
		win_sub1_panel.setPreferredSize(new Dimension(250, 50));
		win_sub1_panel.setBackground(new Color(150, 90, 170));
		win_sub1_panel.setLayout(new GridBagLayout());
		win_panel.add(win_sub1_panel);

		game_win_player.setFont(new Font("Jetbrains mono", Font.BOLD, 20));
		game_win_player.setForeground(new Color(20, 20, 20));
		win_sub1_panel.add(game_win_player);

		win_sub2_panel.setMaximumSize(new Dimension(250, 50));
		win_sub2_panel.setPreferredSize(new Dimension(250, 50));
		win_sub2_panel.setBackground(new Color(75, 160, 180));
		win_sub2_panel.setLayout(new GridBagLayout());
		win_panel.add(win_sub2_panel);

		cntnu_dialogue.setFont(new Font("Jetbrains mono", Font.BOLD, 20));
		cntnu_dialogue.setForeground(new Color(20, 20, 20));
		win_sub2_panel.add(cntnu_dialogue);

		win_sub3_panel.setSize(200, 100);
		win_sub3_panel.setBackground(new Color(75, 160, 180));
		win_sub3_panel.setLayout(new GridBagLayout());
		win_panel.add(win_sub3_panel);

		yes_btn.setFont(new Font("Arial", Font.BOLD, 16));
		yes_btn.setFocusable(false);
		yes_btn.setRolloverEnabled(false);
        yes_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                yes_btn_ActionPerformd(evt);
            }
        });
		win_sub3_panel.add(yes_btn);

		win_space_label.setMaximumSize(new Dimension(40, 20));
		win_space_label.setFont(new Font("Arial", Font.PLAIN, 28));
		win_sub3_panel.add(win_space_label);

		no_btn.setFont(new Font("Arial", Font.BOLD, 16));
		no_btn.setFocusable(false);
		no_btn.setRolloverEnabled(false);
        no_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                no_btn_ActionPerformd(evt);
            }
        });
		win_sub3_panel.add(no_btn);

		choice_sub1_panel.setMaximumSize(new Dimension(250, 50));
		choice_sub1_panel.setPreferredSize(new Dimension(250, 50));
		choice_sub1_panel.setBackground(new Color(150, 90, 170));
		choice_sub1_panel.setLayout(new GridBagLayout());
		choice_panel.add(choice_sub1_panel);

		toss_win_player.setFont(new Font("Jetbrains mono", Font.BOLD, 20));
		toss_win_player.setForeground(new Color(20, 20, 20));
		choice_sub1_panel.add(toss_win_player);

		choice_sub2_panel.setSize(200, 100);
		choice_sub2_panel.setBackground(new Color(75, 160, 180));
		choice_sub2_panel.setLayout(new GridBagLayout());
		choice_panel.add(choice_sub2_panel);

		choice_X_btn.setFont(new Font("Arial", Font.BOLD, 28));
		choice_X_btn.setFocusable(false);
		choice_X_btn.setRolloverEnabled(false);
        choice_X_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choice_X_btn_ActionPerformd(evt);
            }
        });
		choice_sub2_panel.add(choice_X_btn);

		choice_OR_label.setMaximumSize(new Dimension(40, 20));
		choice_OR_label.setFont(new Font("Arial", Font.PLAIN, 28));
		choice_sub2_panel.add(choice_OR_label);

		choice_O_btn.setFont(new Font("Arial", Font.BOLD, 28));
		choice_O_btn.setFocusable(false);
		choice_O_btn.setRolloverEnabled(false);
        choice_O_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choice_O_btn_ActionPerformed(evt);
            }
        });
		choice_sub2_panel.add(choice_O_btn);

		player2_panel.setBackground(new Color(200, 130, 150));
		player2_panel.setBounds(0, 0, 600, 100);
		player2_panel.setLayout(new BoxLayout(player2_panel, BoxLayout.PAGE_AXIS));
		add(player2_panel);

		player2_sub_panel.setMaximumSize(new Dimension(225, 100));
		player2_sub_panel.setOpaque(false);
		player2_sub_panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		player2_sub_panel.setAlignmentY(Component.CENTER_ALIGNMENT);
		player2_sub_panel.setLayout(new BoxLayout(player2_sub_panel, BoxLayout.X_AXIS));
		player2_panel.add(player2_sub_panel);

		player2_label.setMaximumSize(new Dimension(175, 50));
		player2_label.setForeground(new Color(30, 30, 30));
		player2_label.setFont(new Font("Jetbrains mono", Font.BOLD, 28));
		player2_label.setHorizontalAlignment(JLabel.CENTER);
		player2_label.setAlignmentY(Component.CENTER_ALIGNMENT);
		player2_sub_panel.add(player2_label);

		player2_symbol.setMaximumSize(new Dimension(50, 50));
		player2_symbol.setForeground(new Color(30, 30, 30));
		player2_symbol.setBackground(new Color(255, 215, 215));
		player2_symbol.setOpaque(true);
		player2_symbol.setFont(new Font("Arial", Font.BOLD, 28));
		player2_symbol.setHorizontalAlignment(JLabel.CENTER);
		player2_symbol.setAlignmentY(Component.CENTER_ALIGNMENT);
		player2_sub_panel.add(player2_symbol);

		main_panel.setBackground(new Color(200, 170, 120));
		main_panel.setLocation(0, 100);
		main_panel.setSize(new Dimension(586, 500));
		main_panel.setLayout(new GridBagLayout());
		add(main_panel);

		game_panel.setBackground(new Color(100, 100, 120));
		game_panel.setPreferredSize(new Dimension(400, 400));
		game_panel.setMinimumSize(new Dimension(400, 400));
		game_panel.setMaximumSize(new Dimension(400, 400));
		game_panel.setLayout(new GridLayout(3, 3));
		main_panel.add(game_panel);

		player1_panel.setBackground(new Color(120, 150, 200));
		player1_panel.setBounds(0, 600, 600, 100);
		player1_panel.setMaximumSize(new Dimension(600, 100));
		player1_panel.setLayout(new BoxLayout(player1_panel, BoxLayout.PAGE_AXIS));
		add(player1_panel);

		player1_sub_panel.setMaximumSize(new Dimension(225, 100));
		player1_sub_panel.setOpaque(false);
		player1_sub_panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		player1_sub_panel.setAlignmentY(Component.CENTER_ALIGNMENT);
		player1_sub_panel.setLayout(new BoxLayout(player1_sub_panel, BoxLayout.X_AXIS));
		player1_panel.add(player1_sub_panel);

		player1_label.setMaximumSize(new Dimension(175, 50));
		player1_label.setForeground(new Color(30, 30, 30));
		player1_label.setFont(new Font("Jetbrains mono", Font.BOLD, 28));
		player1_label.setHorizontalAlignment(JLabel.CENTER);
		player1_label.setAlignmentY(Component.CENTER_ALIGNMENT);
		player1_sub_panel.add(player1_label);

		player1_symbol.setMaximumSize(new Dimension(50, 50));
		player1_symbol.setForeground(new Color(30, 30, 30));
		player1_symbol.setBackground(new Color(215, 215, 255));
		player1_symbol.setOpaque(true);
		player1_symbol.setFont(new Font("Arial", Font.BOLD, 28));
		player1_symbol.setHorizontalAlignment(JLabel.CENTER);
		player1_symbol.setAlignmentY(Component.CENTER_ALIGNMENT);
		player1_sub_panel.add(player1_symbol);

		toss_btn.setSize(100, 50);
		toss_btn.setMinimumSize(new Dimension(100, 50));
		spg_layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, toss_btn, 0, SpringLayout.HORIZONTAL_CENTER, toss_panel);
		spg_layout.putConstraint(SpringLayout.VERTICAL_CENTER, toss_btn, 0, SpringLayout.VERTICAL_CENTER, toss_panel);
		toss_btn.setFont(new Font("Arial", Font.BOLD, 20));
		toss_btn.setFocusable(false);
        toss_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                toss_btn_ActionPerformed(evt);
            }
        });
		toss_panel.add(toss_btn);

		// Instantiating All 9 buttons
		for (int i=0; i<9; i++){
			game_btns[i] = new JButton();
			game_panel.add(game_btns[i]);
			game_btns[i].setFont(new Font("Arial", Font.BOLD, 75));
			game_btns[i].setBackground(new Color(235, 235, 235));
			game_btns[i].setFocusable(false);
			game_btns[i].setRolloverEnabled(false);
			game_btns[i].setEnabled(false);
	        game_btns[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                game_btns_ActionPerformd(evt);
	            }
	        });
		}

		setSize(600, 735);
		setPreferredSize(new Dimension(600, 735));
		setLayout(null);
		pack();
		setTitle("Tic Tac Toe");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Action Event Listeners
	// Method to Continue the game
	public void yes_btn_ActionPerformd(ActionEvent e){
		win_panel.setVisible(false);
		toss_panel.setVisible(true);
		setEnableBtns(false);
		player1_turn = false;
		isGameEnded = false;
	}

	// Method to exit the Application
	public void no_btn_ActionPerformd(ActionEvent e){
		System.exit(0);
	}

	// Method to enable or disable game buttons
	public void setEnableBtns(boolean status){
		for (int i = 0; i < 9; i++) {
			game_btns[i].setEnabled(status);
			game_btns[i].setBackground(new Color(235, 235, 235));
			game_btns[i].setText("");
		}
	}

	// Eventlistener for toss button
	public void toss_btn_ActionPerformed(ActionEvent e){
		toss();
		toss_panel.setVisible(false);
		choice_panel.setVisible(true);
	}

	// Initializing choices
	public void choice_X_btn_ActionPerformd(ActionEvent e){
		if (player1_turn == true) {
			player1_choice = "X";
			player2_choice = "O";
		}
		else{
			player1_choice = "O";
			player2_choice = "X";
		}
		player1_symbol.setText(player1_choice);
		player2_symbol.setText(player2_choice);
		setEnableBtns(true);
		choice_panel.setVisible(false);
	}

	// Initializing choices
	public void choice_O_btn_ActionPerformed(ActionEvent e){
		if (player1_turn == true) {
			player1_choice = "O";
			player2_choice = "X";
		}
		else{
			player1_choice = "X";
			player2_choice = "O";
		}
		setEnableBtns(true);
		player1_symbol.setText(player1_choice);
		player2_symbol.setText(player2_choice);
		choice_panel.setVisible(false);
	}

	// Eventlistener for game buttons if any clicked
	public void game_btns_ActionPerformd(ActionEvent e){
		for (int i = 0; i < 9; i++) {
			if(e.getSource() == game_btns[i] && isGameEnded != true){
				if (player1_turn == true) {
					if (game_btns[i].getText() == ""){
						game_btns[i].setText(player1_choice);
						game_btns[i].setForeground(new Color(105, 135, 205));
						turnCount++;
						check();
						player1_turn = false;
					}
				}
				else{
					if (game_btns[i].getText() == ""){
						game_btns[i].setText(player2_choice);
						game_btns[i].setForeground(new Color(205, 105, 115));
						turnCount++;
						check();
						player1_turn = true;
					}
				}
			}
		}
	}

	// Method to do Toss for first turn & to choice (X OR O) 
	public void toss(){
		Random random = new Random();
		if(random.nextInt(2) == 0){
			toss_win_player.setText("Player 1 ?");
			player1_turn = true;
			System.out.println("Player 1 Wins Toss!");
		}
		else{
			toss_win_player.setText("Player 2 ?");
			player1_turn = false;
			System.out.println("Player 2 Wins! Toss");
		}
	}

	// Method to check for winning or draw conditions
	public void check(){
		checkWinningConditions("X");
		checkWinningConditions("O");
		checkDrawConditions();
	}

	public void checkDrawConditions(){
		if (isGameEnded == false && turnCount == 9){
			selectWinner("-");
			isGameEnded = true;
			turnCount = 0;
		}
	}

	// Winning conditions of game
	public void checkWinningConditions(String choice){
		winningCondition(choice, 0, 1, 2);
		winningCondition(choice, 3, 4, 5);
		winningCondition(choice, 6, 7, 8);
		winningCondition(choice, 0, 3, 6);
		winningCondition(choice, 1, 4, 7);
		winningCondition(choice, 2, 5, 8);
		winningCondition(choice, 0, 4, 8);
		winningCondition(choice, 2, 4, 6);
	}

	public void winningCondition(String choice, int posn1, int posn2, int posn3){
		if(game_btns[posn1].getText()==choice && game_btns[posn2].getText()==choice && game_btns[posn3].getText()==choice){
			setBtnsBg(posn1, posn2, posn3);
			selectWinner(choice);
			isGameEnded = true;
			turnCount = 0;
			return;
		}
	}

	// Method to highlight Matched Row 
	public void setBtnsBg(int posn1, int posn2, int posn3){
		game_btns[posn1].setBackground(new Color(185, 235, 185));
		game_btns[posn2].setBackground(new Color(185, 235, 185));
		game_btns[posn3].setBackground(new Color(185, 235, 185));
	}

	// Method to select winner amongst the 2 players
	public void selectWinner(String choice){
		Timer timer = new Timer();
		TimerTask tt = new TimerTask(){
			public void run(){
				for (int i = 0; i < 9; i++){
					game_btns[i].setEnabled(false);
				}
				if (choice == player1_choice){
					game_win_player.setText("Player 1 Win!");
					win_panel.setVisible(true);
					System.out.println("Player 1 Win!");
				}
				else if (choice == player2_choice) {
					game_win_player.setText("Player 2 Win!");
					win_panel.setVisible(true);
					System.out.println("Player 2 Win!");
				}
				else if (choice == "-"){
					game_win_player.setText("Match is Draw!");
					win_panel.setVisible(true);
					System.out.println("Match is Draw!");
				}
			}
		};
		timer.schedule(tt, 500);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.setVisible(true);
	}
}