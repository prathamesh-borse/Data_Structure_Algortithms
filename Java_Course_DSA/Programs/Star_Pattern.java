package Java_Course_DSA.Programs;

import java.util.Scanner;

public class Star_Pattern {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printStar(number);
    }

    public static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
