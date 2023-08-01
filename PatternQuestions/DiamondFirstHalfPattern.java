import java.util.Scanner;

public class DiamondFirstHalfPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            diamondfirstHalfPattern(n);
        }
        scan.close();
    }

    static void diamondfirstHalfPattern(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }
}


 


// i=0 = [4 = space, 1 = star, 4 = space]
// i=1 = [3 = space, 3 = star, 3 = space]
// i=2 = [2 = space, 5 = star, 2 = space]
// i=3 = [1 = space, 7 = star, 1 = space]
// i=4 = [0 = space, 9 = star, 0 = space]

// space / star / space

// Approach
// The outer loop will n times
// But in this pattern we can see that there is space and also star
// we first count the number of spaces we have to add before the star
// so, we required two loops for to print space and one loop to print the star

// Pattern
// *
// ***
// *****
// *******
// *********