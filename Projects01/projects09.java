package Projects01;

public class projects09 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			// space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// first part
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			// second part
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
