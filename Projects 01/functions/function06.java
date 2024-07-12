
public class function06 {
	// Function to display Fibonacci series up to n terms
	static void displayFibonacci(int n) {
		int first = 0, second = 1, next;
		System.out.print("Fibonacci series up to " + n + " terms: ");
		for (int i = 0; i < n; ++i) {
			System.out.print(first + ", ");
			next = first + second;
			first = second;
			second = next;
		}
	}

	public static void main(String[] args) {
		// Given number n
		int n = 10;
		// Function call
		displayFibonacci(n);
	}
}
