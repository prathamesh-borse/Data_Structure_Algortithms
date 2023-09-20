package Java_Course_DSA.Programs;

import java.util.Scanner;

public class numberPatternPrint {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        numberPattern(number);
    }

    public static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
