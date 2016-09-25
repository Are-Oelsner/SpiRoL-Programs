//my attempts to create a java applet for my simulation without StdDraw

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 


public class simulation {
/*	public static void setCanvasSize(double width, double height) {
		JFrame frame = new JFrame("testing");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new BorderLayout());
			frame.add(new TestPane());
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
	}
	public static void vector(double x1, double x2, double y1, double y2) {
	} */
	public static void setCanvasSize(int canvasWidth, int canvasHeight) {
        	if (canvasWidth <= 0 || canvasHeight <= 0)
         	   throw new IllegalArgumentException("width and height must be positive");
        	width = canvasWidth;
        	height = canvasHeight;
        	init();
    }
	public static void main(String[] args) {
	
		
		/*	JFrame frame = new JFrame("testing");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new BorderLayout());
			frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
	}
}
