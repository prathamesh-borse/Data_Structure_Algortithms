import java.util.Scanner;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            pattern20(n);
            scan.close();
        }
    }

    static void pattern20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "");
            }

            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "");
            }

            System.out.println();
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }
}

// Approach:




// Pattern: 
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
