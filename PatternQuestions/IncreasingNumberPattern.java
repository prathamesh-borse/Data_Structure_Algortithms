import java.util.Scanner;

public class IncreasingNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            increasingNumber(n);
        }
        scan.close();
    }

    static void increasingNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Approach:
// The outer loop will run from 1 from n times
// The inner loop will from 1 to i times
// and it is printing the j = the number of j is executing


// Pattern:
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5
