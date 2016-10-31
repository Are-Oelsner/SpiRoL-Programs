//my first Library
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout; 
public class Are {
	/*My Java Methods Library
	 * sqrt
	 * factorial
	 * abs
	 * randInt
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
	public static long randInt(long a, long b) {
		return (long)(Math.random() * (b - a + 1)) + a;
	}
	public static double minArray(double[] array) {
		double min = Double.POSITIVE_INFINITY;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min)
				min = array[i];
		}
	}	
	public static void PrintMatrix(int[][] mat) {
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
	}
	//My Fibonacci Program
public class Fibonacci {
	public static void Fibonacci(int N) {
		double[] Fibonacci = new double[N];
		Fibonacci[0] = 0;
		Fibonacci[1] = 1;
		for(int i = 2; i < N; i++) {
			Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
		}
		return Fibonacci[N-1];
	}
}
	
	
	public static void main(String[] args) {
		System.out.printf("My Java Methods Library\nFunctions:\n\tsqrt\n\tfactorial\n\tabs\n\trandInt\n\tminArray");
	}
//		for (int i = 0; i < 100; i++) {
//			System.out.println(randInt(i, 110));
//		}
//	}

//	public static void setCanvasSize(double x, double y) {
//		new window() .setVisible(true);
//		setSize
	
	//public static double Vector(double x1, double x2, double y1, double y2) {
	//	double diff = x1 - x2
	//}
//	public static double freefall
//			x2 = x1 + (vx * t);
//			x1 = x2;
//			y2 = y1 + (vy * t) + (.5 * ay * (t * t));
//			y1 = y2;
       			       
}
