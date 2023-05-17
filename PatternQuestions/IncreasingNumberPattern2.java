import java.util.Scanner;

public class IncreasingNumberPattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            increasingNumber2(n);
        }
        scan.close();
    }

    static void increasingNumber2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


// Approach:
// The outer loop will run from 1 to n times
// The inner loop will from 1 to i times
// and it will print i because i will be increasing and j will check the condition and break the condition


// Pattern:
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5