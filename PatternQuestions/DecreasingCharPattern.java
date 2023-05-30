import java.util.Scanner;

public class DecreasingCharPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            scan.close();
            decreasingCharPattern(n);
        }
    }

    static void decreasingCharPattern(int n) {
        for (int i = 0; i < n; i++) {
            char alphabet = (char) (n + 64);
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet-- + "");
            }
            System.out.println();
        }
    }
}


// Approach: 
// outer loop = 0 to n times
// inner loop = will add n in staring ascii value of 64
// innner loop = compare till less than equal to i
// and decrement the character

// Pattern
// E
// ED
// EDC
// EDCB
// EDCBA
