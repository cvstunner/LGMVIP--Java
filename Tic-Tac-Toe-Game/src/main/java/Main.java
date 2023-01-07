import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main extends JFrame {
	// Global Variables
	JPanel toss_panel = new JPanel();
	JPanel choice_panel = new JPanel();
	JLabel player1_symbol = new JLabel();
	JLabel player2_symbol = new JLabel();
	JButton game_btns[] = new JButton[9];
	boolean player1_turn;
	String player1_choice = "";
	String player2_choice = "";

	// Public Class Constructor
	public  Main(){
		init();
	}

	private void init(){
		SpringLayout spg_layout = new SpringLayout();
		toss_panel.setBackground(new Color(150, 200, 170));
		toss_panel.setBounds(186, 249, 200, 200);
		toss_panel.setLayout(spg_layout);
		add(toss_panel);

		SpringLayout spg_choice_layout = new SpringLayout();
		choice_panel.setBackground(new Color(150, 200, 170));
		choice_panel.setBounds(186, 249, 200, 150);
		choice_panel.setLayout(new GridBagLayout());
		choice_panel.setVisible(false);
		add(choice_panel);

		JButton choice_X_btn = new JButton("X");
		choice_X_btn.setFont(new Font("Arial", Font.BOLD, 28));
		choice_X_btn.setFocusable(false);
		choice_X_btn.setRolloverEnabled(false);
        choice_X_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choice_X_btn_ActionPerformd(evt);
            }
        });
		choice_panel.add(choice_X_btn);

		JLabel choice_OR_label = new JLabel(" OR ");
		choice_OR_label.setMaximumSize(new Dimension(40, 20));
		choice_OR_label.setFont(new Font("Arial", Font.PLAIN, 28));
		choice_panel.add(choice_OR_label);

		JButton choice_O_btn = new JButton("O");
		choice_O_btn.setFont(new Font("Arial", Font.BOLD, 28));
		choice_O_btn.setFocusable(false);
		choice_O_btn.setRolloverEnabled(false);
        choice_O_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choice_O_btn_ActionPerformed(evt);
            }
        });
		choice_panel.add(choice_O_btn);

		SpringLayout spg_layout_pl2 = new SpringLayout();
		JPanel player2_panel = new JPanel(); 
		player2_panel.setBackground(new Color(200, 130, 150));
		player2_panel.setBounds(0, 0, 600, 100);
		player2_panel.setLayout(new BoxLayout(player2_panel, BoxLayout.PAGE_AXIS));
		add(player2_panel);

		JPanel player2_sub_panel = new JPanel(); 
		player2_sub_panel.setMaximumSize(new Dimension(225, 100));
		player2_sub_panel.setOpaque(false);
		player2_sub_panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		player2_sub_panel.setAlignmentY(Component.CENTER_ALIGNMENT);
		player2_sub_panel.setLayout(new BoxLayout(player2_sub_panel, BoxLayout.X_AXIS));
		player2_panel.add(player2_sub_panel);

		JLabel player2_label = new JLabel("Player 2");
		player2_label.setMaximumSize(new Dimension(175, 50));
		player2_label.setForeground(new Color(50, 50, 50));
		player2_label.setFont(new Font("Jetbrains mono", Font.BOLD, 28));
		player2_label.setHorizontalAlignment(JLabel.CENTER);
		player2_label.setAlignmentY(Component.CENTER_ALIGNMENT);
		player2_sub_panel.add(player2_label);

		player2_symbol.setMaximumSize(new Dimension(50, 50));
		player2_symbol.setForeground(new Color(50, 50, 50));
		player2_symbol.setBackground(new Color(255, 215, 215));
		player2_symbol.setOpaque(true);
		player2_symbol.setFont(new Font("Arial", Font.BOLD, 28));
		player2_symbol.setHorizontalAlignment(JLabel.CENTER);
		player2_symbol.setAlignmentY(Component.CENTER_ALIGNMENT);
		player2_sub_panel.add(player2_symbol);

		JPanel main_panel = new JPanel();
		main_panel.setBackground(new Color(200, 170, 120));
		main_panel.setLocation(0, 100);
		main_panel.setSize(new Dimension(586, 500));
		main_panel.setLayout(new GridBagLayout());
		add(main_panel);

		JPanel game_panel = new JPanel();
		game_panel.setBackground(new Color(100, 100, 120));
		game_panel.setPreferredSize(new Dimension(400, 400));
		game_panel.setMinimumSize(new Dimension(400, 400));
		game_panel.setMaximumSize(new Dimension(400, 400));
		game_panel.setLayout(new GridLayout(3, 3));
		main_panel.add(game_panel);

		JPanel player1_panel = new JPanel();
		player1_panel.setBackground(new Color(120, 150, 200));
		player1_panel.setBounds(0, 600, 600, 100);
		player1_panel.setMaximumSize(new Dimension(600, 100));
		player1_panel.setLayout(new BoxLayout(player1_panel, BoxLayout.PAGE_AXIS));
		add(player1_panel);

		JPanel player1_sub_panel = new JPanel(); 
		player1_sub_panel.setMaximumSize(new Dimension(225, 100));
		player1_sub_panel.setOpaque(false);
		player1_sub_panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		player1_sub_panel.setAlignmentY(Component.CENTER_ALIGNMENT);
		player1_sub_panel.setLayout(new BoxLayout(player1_sub_panel, BoxLayout.X_AXIS));
		player1_panel.add(player1_sub_panel);

		JLabel player1_label = new JLabel("Player 1");
		player1_label.setMaximumSize(new Dimension(175, 50));
		player1_label.setForeground(new Color(50, 50, 50));
		player1_label.setFont(new Font("Jetbrains mono", Font.BOLD, 28));
		player1_label.setHorizontalAlignment(JLabel.CENTER);
		player1_label.setAlignmentY(Component.CENTER_ALIGNMENT);
		player1_sub_panel.add(player1_label);

		player1_symbol.setMaximumSize(new Dimension(50, 50));
		player1_symbol.setForeground(new Color(50, 50, 50));
		player1_symbol.setBackground(new Color(215, 215, 255));
		player1_symbol.setOpaque(true);
		player1_symbol.setFont(new Font("Arial", Font.BOLD, 28));
		player1_symbol.setHorizontalAlignment(JLabel.CENTER);
		player1_symbol.setAlignmentY(Component.CENTER_ALIGNMENT);
		player1_sub_panel.add(player1_symbol);

		JButton toss_btn = new JButton("Toss");
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

		for (int i=0; i<9; i++){
			game_btns[i] = new JButton();
			game_panel.add(game_btns[i]);
			game_btns[i].setFont(new Font("Arial", Font.BOLD, 75));
			// game_btns[i].setBorderPainted(false);
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

		// setMinimumSize(new Dimension(600, 700));

		setSize(600, 735);
		setPreferredSize(new Dimension(600, 735));
		// setSize(600 - (getInsets().left + getInsets().right), 739 + (getInsets().top + getInsets().bottom));
		setLayout(null);
		pack();
		setTitle("Tic Tac Toe");
		// setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Event Listeners
	public void setEnableBtns(){
		for (int i = 0; i < 9; i++) {
			game_btns[i].setEnabled(true);
		}
	}

	public void toss_btn_ActionPerformed(ActionEvent e){
		toss();
		toss_panel.setVisible(false);
		choice_panel.setVisible(true);
	}

	public void choice_X_btn_ActionPerformd(ActionEvent e){
		if (player1_turn == true) {
			player1_choice = "X";
			player2_choice = "O";
		}
		else{
			player2_choice = "O";
			player1_choice = "X";
		}
		player1_symbol.setText(player1_choice);
		player2_symbol.setText(player2_choice);
		setEnableBtns();
		choice_panel.setVisible(false);
	}

	public void choice_O_btn_ActionPerformed(ActionEvent e){
		if (player1_turn == true) {
			player1_choice = "O";
			player2_choice = "X";
		}
		else{
			player2_choice = "X";
			player1_choice = "O";
		}
		setEnableBtns();
		player1_symbol.setText(player1_choice);
		player2_symbol.setText(player2_choice);
		choice_panel.setVisible(false);
	}

	public void game_btns_ActionPerformd(ActionEvent e){
		if(e.getSource() == "game_btns"){
			System.out.println("B");
		}
	}

	public void toss(){
		Random random = new Random();
		if(random.nextInt(2) == 0){
			player1_turn = true;
			System.out.println("Player1 Wins!");
		}
		else{
			player1_turn = false;
			System.out.println("Player2 Wins!");
		}
		// toss_panel.setVisible(false);
		System.out.println(player1_turn);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.setVisible(true);
	}
}