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
            for(int j=i;j<=n;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Approach: 
// The outer loop will run from 1 to n times
// The inner loop will start from i to n times
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
// 2 3 4 5 
// 3 4 5 
// 4 5 
// 5