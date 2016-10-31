//My test Simulation code

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MySim {
	public static void main(String[] args) {
		double x2, y2, x1, y1, vx1, vy1, vx2, vy2, ax, ay, t;
		x1 = 0;
		y1 = 0;
		t = 0.0;
		vx1 = 0.0;
		vy1 = 0.0;
		ax = -0.1;
		ay = -.98;

		StdDraw.setCanvasSize(600, 600);
		StdDraw.setXscale(-50, 50);
		StdDraw.setYscale(-50, 50);
		StdDraw.clear(StdDraw.BLUE);

		while(true) {

			StdDraw.clear(StdDraw.BLUE);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledCircle(x1, y1, 2);
			vx2 = vx1 + ax * t;
			vy2 = vy1 + ay * t;
			if (y1 < -50) {
				vy2 = Math.abs(vy2);
			}
			x2 = x1 + (vx2 * t) + (.5 * (ax * (t * t)));
			y2 = y1 + (vy2 * t) + (.5 * (ay * (t * t)));
			x1 = x2;
			y1 = y2;


			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledCircle(x2, y2, 2);
			StdDraw.show();
			StdDraw.pause(30);
			StdDraw.clear(StdDraw.BLUE);
			t += .01;

		}
	}
}


