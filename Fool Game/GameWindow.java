import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GameWindow extends JFrame implements MouseListener, ActionListener
{
	private JPanel panel;
	private JLabel headLabel;
	private JButton yesButton, noButton;

	private Random rand;

	public GameWindow()
	{
		super("Fool Game");

		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);

		headLabel = new JLabel("Are you a fool?");
		headLabel.setBounds(250, 50, 100, 50);
		panel.add(headLabel);

		yesButton = new JButton("Yes");
		yesButton.setBounds(100, 375, 100, 50);
		yesButton.addMouseListener(this);
		yesButton.addActionListener(this);

		panel.add(yesButton);

		noButton = new JButton("No");
		noButton.setBounds(400, 375, 100, 50);
		noButton.addMouseListener(this);
		noButton.addActionListener(this);

		panel.add(noButton);

		this.add(panel);

		rand = new Random();
	}

	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(noButton))
		{
			noButton.setBounds(rand.nextInt(550), rand.nextInt(550), 100, 50);
		}
	}


	public void mouseExited(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}

	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();

		if(elementText.equals(yesButton.getText()))
		{
			FinalWindow a = new FinalWindow("Yes! You're a fool!");
			a.setVisible(true);
			this.setVisible(false);
		}
		else if(elementText.equals(noButton.getText()))
		{
			FinalWindow a = new FinalWindow("No, You're not a fool.");
			a.setVisible(true);
			this.setVisible(false);
		}
	}
}