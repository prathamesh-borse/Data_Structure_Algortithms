import java.util.Scanner;

public class DecreasingStarPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            decreasingStarPattern(n);
        }
        scan.close();

    }

    static void decreasingStarPattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// Approach: 
// The outer loop will run from 1 to n times
// The inner loop will start from i to n times

// i=0;0<=5;
// j=0;0<=5; = *
// j=1;1<=5 = **
// j=2;2<=5 = ***
// j=3;3<=5 = ****
// j=4;4<=5 = *****
// j=5;5<=5 = ******


// Pattern
// * * * * * 
// * * * * 
// * * * 
// * * 
// *