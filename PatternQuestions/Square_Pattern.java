import java.util.Scanner;

public class Square_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            pattern21(n);
            scan.close();
        }
    }

    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Approach:
// 1. loop will run from 0 to n times
// 2. add condition to check the index 0 and n - 1 in the if else block


// Pattern:
// *****
// *   *
// *   *
// *   *
// *****