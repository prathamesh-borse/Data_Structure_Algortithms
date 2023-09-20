package Java_Course_DSA.Programs;

import java.util.Scanner;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printPyramid(number);
    }

    private static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
