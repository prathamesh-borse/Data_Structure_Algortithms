import java.util.Scanner;

public class IncrementingCharacterPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++) {
            int n = scan.nextInt();
            scan.close();
            incrementingCharPattern(n);
        }  
    }

    static void incrementingCharPattern(int n) {

        // int character = 65;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print((char) (character + i) + " ");
        //         // character = character + 1;
        //     }
        //     System.out.println();
        // }
        // My Logic


        for(int i=0;i<n;i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + "");
            }
            System.out.println();
        }
    }
}

// Approach: is simple it will print the character same the time the ith loop will be runned.


// Pattern
// A
// BB
// CCC
// DDDD
// EEEEE