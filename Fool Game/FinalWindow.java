import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FinalWindow extends JFrame implements MouseListener, ActionListener
{
	private JLabel headLabel;
	private JButton returnButton, exitButton;
	private JPanel panel;

	public FinalWindow(String s)
	{
		super("Fool Game");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);

		headLabel = new JLabel(s);
		headLabel.setBounds(225, 50, 300, 100);

		panel.add(headLabel);

		returnButton = new JButton("Return");
		returnButton.setBounds(100, 375, 100, 50);
		returnButton.addMouseListener(this);
		returnButton.addActionListener(this);

		panel.add(returnButton);

		exitButton = new JButton("Exit");
		exitButton.setBounds(400, 375, 100, 50);
		exitButton.addMouseListener(this);
		exitButton.addActionListener(this);

		panel.add(exitButton);

		this.add(panel);

	}



	public void mouseEntered(MouseEvent me)
	{
	}

	public void mouseExited(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();
		
		if(elementText.equals(returnButton.getText()))
		{
			GameWindow f = new GameWindow();
			f.setVisible(true);
			this.setVisible(false);			
		}
		else if(elementText.equals(exitButton.getText()))
		{
			System.exit(0);
		}
	}
}