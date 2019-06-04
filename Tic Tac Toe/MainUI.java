import java.lang.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainUI extends JFrame implements ActionListener{
	private JLabel intro, number,mark;
	private JButton ready, exit;
	private JComboBox combo1, combo2;
	private JPanel panel;
	
	public MainUI(){
		super("Tic Tac Toe");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String []s = {"1", "2"};
		String []m = {"O", "X"};

		panel = new JPanel();
		panel.setLayout(null);
		
		intro = new JLabel("Tic Tac Toe");
		intro.setBounds(300,0,350,150);
		intro.setFont(new Font("Times New Roman", Font.BOLD, 35));
		panel.add(intro);
		
		number = new JLabel("Select Player Position:");
		number.setBounds(200,180,200,40);
		number.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(number);

		combo1 = new JComboBox(s);
		combo1.setBounds(450,180,80,40);
		panel.add(combo1);

		mark = new JLabel("Select Your Mark:");
		mark.setBounds(200,240,200,40);
		mark.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(mark);

		combo2 = new JComboBox(m);
		combo2.setBounds(450,240,80,40);
		panel.add(combo2);

		ready = new JButton("Ready");
		ready.setBounds(200,330,100,60);
		ready.setBackground(Color.BLACK);
		ready.setForeground(Color.WHITE);
		ready.setFont(new Font("Times New Roman", Font.BOLD, 18));
		ready.addActionListener(this);
		panel.add(ready);
		
		exit = new JButton("exit");
		exit.setBounds(500,330,100,60);
		exit.setBackground(Color.RED);
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		exit.addActionListener(this);
		panel.add(exit);
		
		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();
		
		if(elementText.equals(ready.getText()))
		{
			String selectNumber = combo1.getSelectedItem().toString();
			String selectMark = combo2.getSelectedItem().toString(); 
			SecondUI s = new SecondUI(selectNumber,selectMark);
			s.setVisible(true);
			this.setVisible(false);		
		}
		else if(elementText.equals(exit.getText()))
		{
			System.exit(0);
		}
	}
	
}