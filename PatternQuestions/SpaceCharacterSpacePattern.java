import java.util.Scanner;

public class SpaceCharacterSpacePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++) {
            int n = scan.nextInt();
            scan.close();
            spaceCharacterPattern(n);
        }
    }

    static void spaceCharacterPattern(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int breakpoint = (2 * i + 1) / 2;
            char alphabet = 'A';
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(alphabet);
                if (j <= breakpoint) {
                    alphabet++;
                } else {
                    alphabet--;
                }
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


// Approach: 
// space = n - i - 1 times = loop for printing space
// alpabet = 
// int breakpoint = (2 * i + 1) / 2;
// char alphabet = 'A';
// for (int j = 1; j <= 2 * i + 1; j++) {
//     System.out.print(alphabet);
//         if (j <= breakpoint) {
//             alphabet++;
//         } else {
//             alphabet--;
//             }
//         }

// Pattern
//     A    
//    ABA   
//   ABCBA  
//  ABCDCBA 
// ABCDEDCBA