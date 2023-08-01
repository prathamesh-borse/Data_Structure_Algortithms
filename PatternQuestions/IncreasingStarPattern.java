import java.util.Scanner;

public class IncreasingStarPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            increasingPattern(n);
        }
        scan.close();
    }

    static void increasingPattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}


// Approach:
// The outer loop will run from 1 to n
// The inner loop will run from 0 to i times 
// in inner loop will check if 1 <= 1 or not

// Pattern:
// * 
// * * 
// * * * 
// * * * * 
// * * * * *