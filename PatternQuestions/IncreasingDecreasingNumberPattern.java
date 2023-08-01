import java.util.Scanner;

public class IncreasingDecreasingNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            increasingdecreasingNumberPattern(n);
            scan.close();
        }
    }

    static void increasingdecreasingNumberPattern(int n) {

        // Solving approach by striver
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            space -= 2;

        }

        // for (int i = 1; i <= n; i++) {
        // // numbers
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }

        // // space
        // for (int j = 1; j <= 2 * (n-i); j++) {
        // System.out.print(" ");
        // }

        // // numbers
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }

        // System.out.println();

        // }
    }
}

// Approach 1: numbers, space, numbers
// 1. The outer for loop will run from 1 to n times
// 2. the first loop will print the increasing number pattern
// 3. the second loop will print space ( 2 * (n-1)) and also after printing the
// new line we have minus space - 2;
// 4. the third loop will print the numbers in decreasing, loop will run from i
// to >=1 and minus the j

// Pattern
// 1 1
// 12 21
// 123 321
// 12344321