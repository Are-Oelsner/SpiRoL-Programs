//My Java code 
//assistance from http://www.ntu.edu.sg/home/ehchua/programming/java/j8a_gameintro-bouncingballs.html

import java.awt.*;
import java.util.Formatter;
import javax.swing.*;

public class Sim2 extends JPanel {
	private static final int BOX_WIDTH = 600;
	private static final int BOX_HEIGHT = 600;

	private double ballRadius = 20; //Ball's Radius
	private double X1 = ballRadius + 50; //Ball's Center (x)
	private double Y1 = ballRadius + 20; //Ball's Center (y)
	private double AX = 0;
	private double AY = -.98;
	public  double t = 0;
	private double VY1 = 0;
	private double VX = AX * t; //Ball's speed for x
	private double VY = VY1 + AY * t; //Ball's speed for y

	private static final int UPDATE_RATE = 30; //number of refresh per second

	public Sim2() {
		this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));

		Thread simThread = new Thread() {
			public void run() {
				while (true) {
					X1 += VX;
					Y1 += VY;
					t += .1;
					VY = VY1 + AY * t;
					VY1 = VY;

					if (X1 - ballRadius < 0) {
						VX = -VX;
						X1 = ballRadius;
					}
					else if (X1 + ballRadius > BOX_WIDTH) {
						VX = -VX;
						X1 = BOX_WIDTH - ballRadius;
					}
					if (Y1 - ballRadius < 0) {
						VY = -VY;
						Y1 = ballRadius;
					} 
					else if (Y1 + ballRadius > BOX_HEIGHT) {
						VY = -VY;
						Y1 = BOX_HEIGHT - ballRadius;
					}

					repaint();
					try {
						Thread.sleep(1000 / UPDATE_RATE);
					} catch (InterruptedException ex) { }
				}
			}
		};
		simThread.start();
	}
 	/** Custom rendering codes for drawing the JPanel */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);    // Paint background

		// Draw the box
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, BOX_WIDTH, BOX_HEIGHT);

		// Draw the ball
		g.setColor(Color.BLUE);
		g.fillOval((int) (X1 - ballRadius), (int) (Y1 - ballRadius),
				(int)(2 * ballRadius), (int)(2 * ballRadius));

		// Display the ball's information
		g.setColor(Color.WHITE);
		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb);
		formatter.format("Ball @(%3.0f,%3.0f) Speed=(%2.0f,%2.0f)", X1, Y1,
				VX, VY);
		g.drawString(sb.toString(), 20, 30);
	}

	/** main program (entry point) */
	public static void main(String[] args) {
		// Run GUI in the Event Dispatcher Thread (EDT) instead of main thread.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Set up main window (using Swing's Jframe)
				JFrame frame = new JFrame("A Bouncing Ball");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setContentPane(new Sim2());
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
