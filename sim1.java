//my bouncing ball simulation attempt using StdDraw
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class sim1 extends JFrame {
	public static void main(String[] args) {
		new sim1() .setVisible(true);
	}
	private sim1() {
		super("tutorial");
		setSize(600, 600); //sets width, height
	//	setResizeable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton button = new JButton("Click Me");
		add(button);
	}
} /*

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
