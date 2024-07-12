
public class functions05 {
	public static int twoGcd(int x, int y) {
		int gcd = 1;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public static void main(String[] args) {
		int a = 12;
		int b = 8;
		System.out.println(twoGcd(a, b));
	}
}
