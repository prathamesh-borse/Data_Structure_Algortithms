import java.util.Scanner;

public class IncreasingStarsOneLess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            incrasingStars(n);
            scan.close();
        }
    }

    static void incrasingStars(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }
}

// Approach:
// this pattern is same as the full diamond here is one catch after printing in increasing direction it will decrease the stars
// 1. the first for loop will run from 1 to 2*n-1 times.
// 2. the inner for loop will run from 1 to i times. stars = i; j<=stars
// 3. next we have to add condition like if i > n then stars will printed as 2 * n - i;

// Pattern:
// *
// **
// ***
// ****
// ***
// **
// *