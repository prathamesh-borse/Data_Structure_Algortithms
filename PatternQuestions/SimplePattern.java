import java.util.Scanner;

public class SimplePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++) {
            int n = scan.nextInt();
            simplePattern(n);
        }
        scan.close();
    } 

    static void simplePattern(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// Approach:
// The outer loop will start from 0 to n
// The inner loop will also run from 0 to n

// Pattern = this pattern will print 5 stars on each rows and columns
// *******
// *******
// *******
// *******
// *******
