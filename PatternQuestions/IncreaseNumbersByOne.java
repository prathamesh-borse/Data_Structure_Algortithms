import java.util.Scanner;

public class IncreaseNumbersByOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            incraseNumberByOne(n);
            scan.close();
        }
    }

    static void incraseNumberByOne(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(start++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// Approach 1:
// 1. the outer loop will run form 1 to n times
// 2. the inner loop will run from 1 to i times
// 3. use the extra variable to store and print the number that is increasing by one number every time


// Pattern
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10