import java.util.Scanner;

public class projects02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (i == 0 || j == 0 || i == a || j == b) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
