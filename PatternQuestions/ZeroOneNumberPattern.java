import java.util.Scanner;

public class ZeroOneNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            zeroOneNumber2(n);
        }
        scan.close();

    }

    // static void zeroOneNumber(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // if (i % 2 == 0) {
    // if (j % 2 == 0) {
    // System.out.print("1" + " ");
    // } else {
    // System.out.print("0" + " ");
    // }

    // } else {
    // if (j % 2 == 0) {
    // System.out.print("0" + " ");
    // } else {
    // System.out.print("1" + " ");
    // }

    // }

    // }
    // System.out.println();
    // }
    // }

    // Pattern11 = Solving Approach 2 by striver
    static void zeroOneNumber2(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}


// Approach 1:
// 1. The outer for loop will run from 1 to n times 
// 2. as seeing to the pattern, it is showing that on even position the 1 is printed, and on the odd number 0 is printed.
// 3. simply using the modulus operator in the if else and printing the 0 and 1

// Approach 2:
// 1. The outer for loop will run from 1 to n times 
// 2. as 1 is printing on the odd side, so use the extra variable to know that the 1 is printing on odd side
// 3. and use the inner for loop till i to print the extra variable

// Pattern
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 