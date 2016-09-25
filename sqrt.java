//my first attempt
public class Are {
	public static double sqrt(double c) {
		if (c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t -c/t) > err * t)
			t = (c/t + t) / 2.0;
		return t;
	}
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		System.out.println(sqrt(x));
	}
}
