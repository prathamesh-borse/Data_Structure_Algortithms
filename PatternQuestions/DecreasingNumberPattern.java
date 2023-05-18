import java.util.Scanner;

public class DecreasingNumberPattern {
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
            for(int j=1;j<=n-i+1;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Approach: 
// The outer loop will run from 1 to equal to n times
// The inner loop will start from 1 to n-i+1 = 5-1+1 = 5; 5-2+1 = 4 times
// Print the j = the number of times j loop will run

// i=0;0<=5;
// j=0;0<=5; = 1
// j=1;1<=5 = 1 2 
// j=2;2<=5 = 1 2 3
// j=3;3<=5 = 1 2 3 4
// j=4;4<=5 = 1 2 3 4 5
// j=5;5<=5 = 1 2 3 4 5


// Pattern
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2
// 1