package Projects01;

public class projects06 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= n; j++) {
				if (j == 0 || j == n || i == 0 || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
