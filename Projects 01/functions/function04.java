
public class function04 {
	static double power(double x, int n) {
		if (n == 0) {
			return 1;
		} else if (n > 0) {
			return x * power(x, n - 1);
		} else {
			return 1 / power(x, -n);
		}
	}

	public static void main(String[] args) {
		double x = 3.5;
		int n = -2;
		System.out.println(power(x, n));
	}

}