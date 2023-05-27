import java.util.Scanner;

public class IncreasingCharacterPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            scan.close();
            characterPattern(n);
        }
    }

    static void characterPattern(int n) {

        // Solving Approach by Striver
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        // int alphabet = 65;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print((char) (alphabet + j) + " ");
        // }
        // System.out.println();
        // }
    }
}

// Approach 1:
// outer loop will run 0 to n times
// inner loop which will be of character will run from 'A' to less than equal to 'A' + i times
// and will print j

// Approach 2:
// use the extra variable to store the character ascii value and then type cast
// that value into character
// outer loop will run 0 to n times
// inner loop will run from 0 to less than equal to i times
// and will print extra variable + j

// Pattern
// A
// A B
// A B C
// A B C D
// A B C D E