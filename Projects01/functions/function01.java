package Projects01.functions;

public class function01 {

	public static int calc(int a, int b, int x) {
		if (x == 1) {
			return a + b;
		} else if (x == 2) {
			return a * b;
		} else if (x == 3) {
			return a - b;
		} else if (x == 4) {
			return a / b;
		} else {
			return a % b;
		}
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 444;
		int x = 5;

		System.out.println(calc(a, b, x));
	}
}
