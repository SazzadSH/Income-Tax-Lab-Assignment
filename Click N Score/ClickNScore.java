import java.lang.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickNScore extends JFrame implements ActionListener, Runnable
{
	private JPanel panel;
	private JButton[] button = new JButton[10];
	private JButton exit;
	private JLabel score;
	private static int count = 0, i, time;

	public ClickNScore()
	{
		super("Click and Counter");
		this.setSize(700, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel =  new JPanel();
		panel.setLayout(null);
		
		score = new JLabel("Score: " +count);
		score.setBounds(300, 25, 350, 60);
		panel.add(score);
		
		button[0] = new JButton("Button 1");
		button[0].setBounds(150, 100, 150, 50);
		button[0].setBackground(Color.RED);
		button[0].addActionListener(this);
		panel.add(button[0]);
		
		button[1] = new JButton("Button 2");
		button[1].setBounds(350, 100, 150, 50);
		button[1].setBackground(Color.RED);
		button[1].addActionListener(this);
		panel.add(button[1]);
		
		button[2] = new JButton("Button 3");
		button[2].setBounds(150, 200, 150, 50);
		button[2].setBackground(Color.RED);
		button[2].addActionListener(this);
		panel.add(button[2]);
		
		button[3] = new JButton("Button 4");
		button[3].setBounds(350, 200, 150, 50);
		button[3].setBackground(Color.RED);
		button[3].addActionListener(this);
		panel.add(button[3]);
		
		button[4] = new JButton("Button 5");
		button[4].setBounds(150, 300, 150, 50);
		button[4].setBackground(Color.RED);
		button[4].addActionListener(this);
		panel.add(button[4]);
		
		button[5] = new JButton("Button 6");
		button[5].setBounds(350, 300, 150, 50);
		button[5].setBackground(Color.RED);
		button[5].addActionListener(this);
		panel.add(button[5]);
		
		button[6] = new JButton("Button 7");
		button[6].setBounds(150, 400, 150, 50);
		button[6].setBackground(Color.RED);
		button[6].addActionListener(this);
		panel.add(button[6]);
		
		button[7] = new JButton("Button 8");
		button[7].setBounds(350, 400, 150, 50);
		button[7].setBackground(Color.RED);
		button[7].addActionListener(this);
		panel.add(button[7]);
		
		button[8] = new JButton("Button 9");
		button[8].setBounds(150, 500, 150, 50);
		button[8].setBackground(Color.RED);
		button[8].addActionListener(this);
		panel.add(button[8]);
		
		button[9] = new JButton("Button 10");
		button[9].setBounds(350, 500, 150, 50);
		button[9].setBackground(Color.RED);
		button[9].addActionListener(this);
		panel.add(button[9]);
		
		exit = new JButton("Exit");
		exit.setBounds(150, 700, 350, 50);
		exit.setBackground(Color.CYAN);
		exit.addActionListener(this);
		panel.add(exit);
		
		this.add(panel);
	}
	
	Random colorRand = new Random();
	Random timeRand = new Random();
	

	public void run()
	{
		try{
			while(count >= 0)
			{
				i = colorRand.nextInt(10);
				time = 1000 + timeRand.nextInt(5000)/1000;

				button[i].setBackground(Color.GREEN);
				Thread.sleep(time);
				button[i].setBackground(Color.RED);
			}
			
			for(int i = 0; i < 10; i++)
			{
				button[i].setEnabled(false);
			}
			
			exit.setBounds(150, 700, 350, 50);

		}
		catch(Exception e){}
	}


	public void actionPerformed(ActionEvent ae)
	{
		String text = ae.getActionCommand();
		
		if(text.equals(button[i].getText()))
		{
			count = count + 1;
			score.setText("Score: " + count);
		}
		else if(text.equals(exit.getText()))
		{
			System.exit(0);
		}
		else if(!text.equals(button[i].getText()))
		{
			 count = count - 1;
			 score.setText("Score: " +count);
		}
	}

}
