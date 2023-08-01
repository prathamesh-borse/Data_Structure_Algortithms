// First Pattern that i come with simple logic and my own logic

import java.util.Scanner;

public class SideStarPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            sidePattern(n);
        }
        scan.close();
    }

    static void sidePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}

// Approach:
// 1. Simply use the increment star pattern program 
// 2. after that use the decrement star pattern program but make sure it will run one condition decrease.
// 3. and inside them print the star 

// Pattern
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *