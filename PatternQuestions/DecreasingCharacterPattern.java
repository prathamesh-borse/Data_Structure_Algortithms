import java.util.Scanner;

public class DecreasingCharacterPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            scan.close();
            decreasingCharacterPattern(n);
        }
    }

    static void decreasingCharacterPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}


// Approach 1:
// outer loop will run from 0 to n times
// inner loop which will be of character will start from 'A' and checks till 'A' + (n-i-1)
// will print the value of j

// Pattern
// A B C D E 
// A B C D 
// A B C 
// A B 
// A 