package AtoZDSA.Patterns;

import java.util.Scanner;

public class FifthPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern5(n);
    }

    private static void printPattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
