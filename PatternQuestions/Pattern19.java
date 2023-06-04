import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            pattern19(n);
            scan.close();
        }
    }

    static void pattern19(int n) {
        int initialSpace = 0;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + "");
            }

            // space
            for (int k = 0; k < initialSpace; k++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + "");
            }
            initialSpace += 2;
            System.out.println();
        }

        initialSpace = 8;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }

            // space
            for (int k = 0; k < initialSpace; k++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            initialSpace -= 2;
            System.out.println();
        }
    }
}
