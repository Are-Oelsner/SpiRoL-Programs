//my first Library
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class Are {
	/*My Java Methods Library
	 * sqrt
	 * factorial
	 * abs
	 * setCanvasSize
	 */
	public static double sqrt(double c) {
		if (c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t -c/t) > err * t)
			t = (c/t + t) / 2.0;
		return t;
	}
	public static long factorial(int N) {
		if (N==1) return 1;
		return N * factorial(N - 1);
	}
	public static double abs(double x) {
		if (x < 0)
			x = -x;
		return x;
	}
	public static void setCanvasSize(double x, double y) {
		new window() .setVisible(true);
		setSize
	
	//public static double Vector(double x1, double x2, double y1, double y2) {
	//	double diff = x1 - x2
	//}
//	public static double freefall
//			x2 = x1 + (vx * t);
//			x1 = x2;
//			y2 = y1 + (vy * t) + (.5 * ay * (t * t));
//			y1 = y2;
       			       
}
