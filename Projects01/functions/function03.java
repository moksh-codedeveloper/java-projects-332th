package Projects01.functions;

public class function03 {
	public static boolean isEven(int n) {
		if (n % 2 != 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(isEven(n));
	}
}
