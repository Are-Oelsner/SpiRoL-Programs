//my bouncing ball simulation attempt using StdDraw

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

public class sim1 extends JFrame implements KeyListener {
	public static int width = 600;
	public static int height = 600;

	public SimGUI() {
		JFrame frame = new JFrame("Ball Simulator");
	
		frame.setSize(width, height);

		frame.addKeyListener(this);

		frame.setVisible(true);

		JButton button = new JButton

/*	private static BufferedImage offscreenImage, onscreenImage;
	private static Graphics2D offscreen, onscreen;


	public static JFrame frame;

	static {
		init();
	}

	private static void init() {
		if (frame != null) frame.setVisible(false);
		frame = new JFrame();
		offscreenImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		onscreenImage  = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		offscreen = offscreenImage.createGraphics();
		onscreen  = onscreenImage.createGraphics();
		setXscale();
		setYscale();
		offscreen.setColor(DEFAULT_CLEAR_COLOR);
		offscreen.fillRect(0, 0, width, height);
		setPenColor();
		setPenRadius();
		setFont();
		clear();	

		// add antialiasing
		RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		offscreen.addRenderingHints(hints);

		// frame stuff
		ImageIcon icon = new ImageIcon(onscreenImage);
		JLabel draw = new JLabel(icon);


		draw.addMouseListener(std);
		draw.addMouseMotionListener(std);

		frame.setContentPane(draw);
		frame.addKeyListener(std);    // JLabel cannot get keyboard focus
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            // closes all windows
		// frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      // closes only current window
		frame.setTitle("Standard Draw");
		frame.setJMenuBar(createMenuBar());
		frame.pack();
		frame.requestFocusInWindow();
		frame.setVisible(true);
	}


	public static void setCanvasSize(int Width, int Height) {
		width = Width;
		height = Height;
		init();
	}






		public static void main(String[] args) {
		new sim1() .setVisible(true);
	}

	private sim1() {
	super("Ball Simulator");
	frame = new JFrame();
	setSize(600, 600); //sets width, height
	frame.setVisible(true);
	//	setResizeable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	JButton button = new JButton("Click Me");
	add(button);
	}
} 

StdDraw.setCanvasSize(600,600);
StdDraw.setXscale(-100, 100); //Redefine coordinate system
StdDraw.setYscale(-100, 100);
StdDraw.enableDoubleBuffering(); //Allows for smooth animation

double x1 = 0, 
y1 = 0, 
x2 = 0, 
y2 = 0, 
t = 0,
time = 0,
ax = 0, 
ay = -.98,
vx = Double.parseDouble(args[0]),
vy = Double.parseDouble(args[1]), 
vy1 = 0; 



while(true) {
StdDraw.textRight(-20, 90, "Control the circle with WASD");
vy += ay;
vx += ax;
x2 = x1 + (vx);
x1 = x2;
y2 = y1 + (vy);// + (.5 * ay * (t * t));
y1 = y2;
if (x1 > 90) {
vx = Are.abs(vx);
vx = -vx;
}
if (x1 < -90) 
vx = Are.abs(vx);
if (y1 < -90) {
vy = Are.abs(vy);
y1 = -90;
}
if (y1 > 90) {
vy = Are.abs(vy);
vy = -vy;
}


StdDraw.setPenColor(StdDraw.BLACK);
StdDraw.circle(x1, y1, 10);

StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.filledCircle(x1, y1, 10);			
StdDraw.show();
StdDraw.pause(33);
StdDraw.clear();
swit









/*	if(movement == 'w')
	y1 += distance;
	if(movement == 's')
	y1 -= distance;
	if(movement == 'a')
	x1 -= distance;
	if(movement == 'd')
	x1 += distance;

	StdDraw.show();
	StdDraw.pause(33);
	StdDraw.clear();
}
System.exit(0);

}
}

*/
