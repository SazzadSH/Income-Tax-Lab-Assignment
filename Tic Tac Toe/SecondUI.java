import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondUI extends JFrame implements ActionListener{
	private JLabel intro;
	private JButton playAgain, exit;
	private JButton button[] = new JButton[9];
	private JPanel gamePanel;
	private static int counter = 1;
	private String  firstPlayerMark, secondPlayerMark,track;
	private int winner, playerNumber;
	private String[][] markPosition = new String[3][3];
	private boolean draw = true;

	public SecondUI(String selectNumber, String selectMark){
		super("Tic Tac Toe");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		if(selectNumber =="1" && selectMark =="O"){
			firstPlayerMark = "O";
			secondPlayerMark = "X";
		}else if(selectNumber =="1" && selectMark =="X"){
			firstPlayerMark = "X";
			secondPlayerMark = "O";
		}else if(selectNumber =="2" && selectMark =="O"){
			firstPlayerMark = "X";
			secondPlayerMark = "O";
		}else{
			firstPlayerMark = "O";
			secondPlayerMark = "X";
		}

		gamePanel = new JPanel();
		gamePanel.setLayout(null);

		button[0] = new JButton("1");
		button[0].setBounds(10,10,120,125);
		button[0].setBackground(Color.BLACK);
		button[0].setForeground(Color.WHITE);
		button[0].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[0].addActionListener(this);
		gamePanel.add(button[0]);

		button[1] = new JButton("2");
		button[1].setBounds(140,10,120,125);
		button[1].setBackground(Color.BLACK);
		button[1].setForeground(Color.WHITE);
		button[1].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[1].addActionListener(this);
		gamePanel.add(button[1]);

		button[2] = new JButton("3");
		button[2].setBounds(270,10,120,125);
		button[2].setBackground(Color.BLACK);
		button[2].setForeground(Color.WHITE);
		button[2].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[2].addActionListener(this);
		gamePanel.add(button[2]);

		button[3] = new JButton("4");
		button[3].setBounds(10,145,120,125);
		button[3].setBackground(Color.BLACK);
		button[3].setForeground(Color.WHITE);
		button[3].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[3].addActionListener(this);
		gamePanel.add(button[3]);

		button[4] = new JButton("5");
		button[4].setBounds(140,145,120,125);
		button[4].setBackground(Color.BLACK);
		button[4].setForeground(Color.WHITE);
		button[4].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[4].addActionListener(this);
		gamePanel.add(button[4]);

		button[5] = new JButton("6");
		button[5].setBounds(270,145,120,125);
		button[5].setBackground(Color.BLACK);
		button[5].setForeground(Color.WHITE);
		button[5].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[5].addActionListener(this);
		gamePanel.add(button[5]);

		button[6] = new JButton("7");
		button[6].setBounds(10,280,120,125);
		button[6].setBackground(Color.BLACK);
		button[6].setForeground(Color.WHITE);
		button[6].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[6].addActionListener(this);
		gamePanel.add(button[6]);

		button[7] = new JButton("8");
		button[7].setBounds(140,280,120,125);
		button[7].setBackground(Color.BLACK);
		button[7].setForeground(Color.WHITE);
		button[7].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[7].addActionListener(this);
		gamePanel.add(button[7]);

		button[8] = new JButton("9");
		button[8].setBounds(270,280,120,125);
		button[8].setBackground(Color.BLACK);
		button[8].setForeground(Color.WHITE);
		button[8].setFont(new Font("Times New Roman", Font.BOLD, 18));
		button[8].addActionListener(this);
		gamePanel.add(button[8]);

		intro = new JLabel("First Player Turn, Mark: " + firstPlayerMark);
		intro.setBounds(420,10,300,150);
		intro.setFont(new Font("Times New Roman", Font.BOLD, 20));
		gamePanel.add(intro);
		
		playAgain = new JButton("Play Again");
		playAgain.setBounds(420,180,120,125);
		playAgain.setBackground(Color.GREEN);
		playAgain.setForeground(Color.BLACK);
		playAgain.setFont(new Font("Times New Roman", Font.BOLD, 18));
		playAgain.addActionListener(this);
		gamePanel.add(playAgain);
		
		exit = new JButton("Exit");
		exit.setBounds(580,180,120,125);
		exit.setBackground(Color.RED);
		exit.setForeground(Color.BLACK);
		exit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		exit.addActionListener(this);
		gamePanel.add(exit);
		
		this.add(gamePanel);
	}
	public String placeMark(){
		if(counter%2==1){
			counter++;
			intro.setText("Second Player Turn, Mark: " + secondPlayerMark);
			draw();
			return firstPlayerMark;
		}else{
			counter++;
			intro.setText("First Player Turn, Mark: " + firstPlayerMark);
			draw();
			return secondPlayerMark;
		}
	}
	public void winner(){
		if(markPosition[0][0] ==markPosition[1][1] && markPosition[1][1] ==markPosition[2][2] && markPosition[0][0]!=null){
			if(markPosition[0][0]==firstPlayerMark){
				intro.setText("The Winner is Player One");
				for(int i=0;i<9;i++){
					button[i].setEnabled(false);
				}
			}else{
				intro.setText("The Winner is Player Two");;
				for(int i=0;i<9;i++){
					button[i].setEnabled(false);
				}
			}
		}else if(markPosition[0][2] ==markPosition[1][1] && markPosition[1][1] ==markPosition[2][0] && markPosition[0][2]!=null){
				if(markPosition[0][2]==firstPlayerMark){
				intro.setText("The Winner is Player: 1");
				for(int i=0;i<9;i++){
					button[i].setEnabled(false);
				}
			}else{
				intro.setText("The Winner is Player: 2");
				for(int i=0;i<9;i++){
					button[i].setEnabled(false);
				}
			}
		}
		for(int i=0;i<3;i++){
			if(markPosition[i][0]==markPosition[i][1] && markPosition[i][1]==markPosition[i][2] && markPosition[i][0]!=null){
				if(markPosition[i][0]==firstPlayerMark){
					intro.setText("The Winner is Player: 1");
					for(int j=0;j<9;j++){
						button[j].setEnabled(false);
					}
					break;
				}else{
					intro.setText("The Winner is Player: 2");
					for(int j=0;j<9;j++){
						button[j].setEnabled(false);
					}
					break;
				}
			}else if(markPosition[0][i]==markPosition[1][i] && markPosition[1][i]==markPosition[2][i] && markPosition[0][i]!=null){
				if(markPosition[0][i]==firstPlayerMark){
					intro.setText("The Winner is Player: 1");
					for(int j=0;j<9;j++){
						button[j].setEnabled(false);
					}
					break;
				}else{
					intro.setText("The Winner is Player: 2");
					for(int j=0;j<9;j++){
						button[j].setEnabled(false);
					}
					break;
				}
			}
		}
	}
	public void draw(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(markPosition[i][j]==null){
					draw=false;
					break;
				}else{
					draw=true;
				}
			}
		}
		if(draw){
				intro.setText("Draw");
		}
	}
	public void actionPerformed(ActionEvent ae){
		String elementText = ae.getActionCommand();
		if(elementText == button[0].getText()){
			String track = placeMark();
			button[0].setText(track);
			button[0].setBackground(Color.WHITE);
			button[0].setForeground(Color.BLACK);
			button[0].setEnabled(false);
			markPosition[0][0] = track;
			winner();
			draw();
		}else if(elementText == button[1].getText()){
			String track = placeMark();
			button[1].setText(track);
			button[1].setBackground(Color.WHITE);
			button[1].setForeground(Color.BLACK);
			button[1].setEnabled(false);
			markPosition[0][1] = track;
			winner();
			draw();
		}else if(elementText == button[2].getText()){
			String track = placeMark();
			button[2].setText(track);
			button[2].setBackground(Color.WHITE);
			button[2].setForeground(Color.BLACK);
			button[2].setEnabled(false);
			markPosition[0][2] = track;
			winner();
			draw();
		}else if(elementText == button[3].getText()){
			String track = placeMark();
			button[3].setText(track);
			button[3].setBackground(Color.WHITE);
			button[3].setForeground(Color.BLACK);
			button[3].setEnabled(false);
			markPosition[1][0] = track;
			winner();
			draw();
		}else if(elementText == button[4].getText()){
			String track = placeMark();
			button[4].setText(track);
			button[4].setBackground(Color.WHITE);
			button[4].setForeground(Color.BLACK);
			button[4].setEnabled(false);
			markPosition[1][1] = track;
			winner();
			draw();
		}else if(elementText == button[5].getText()){
			String track = placeMark();
			button[5].setText(track);
			button[5].setBackground(Color.WHITE);
			button[5].setForeground(Color.BLACK);
			button[5].setEnabled(false);
			markPosition[1][2] = track;
			winner();
			draw();
		}else if(elementText == button[6].getText()){
			String track = placeMark();
			button[6].setText(track);
			button[6].setBackground(Color.WHITE);
			button[6].setForeground(Color.BLACK);
			button[6].setEnabled(false);
			markPosition[2][0] = track;
			winner();
			draw();
		}else if(elementText == button[7].getText()){
			String track = placeMark();
			button[7].setText(track);
			button[7].setBackground(Color.WHITE);
			button[7].setForeground(Color.BLACK);
			button[7].setEnabled(false);
			markPosition[2][1] = track;
			winner();
			draw();
		}else if(elementText == button[8].getText()){
			String track = placeMark();
			button[8].setText(track);
			button[8].setBackground(Color.WHITE);
			button[8].setForeground(Color.BLACK);
			button[8].setEnabled(false);
			markPosition[2][2] = track;
			winner();
			draw();
		}else if(elementText.equals(playAgain.getText())){
			counter = 1;
			MainUI m = new MainUI();
			m.setVisible(true);
			this.setVisible(false);			
		}
		else if(elementText.equals(exit.getText())){
			System.exit(0);
		}
	}
}