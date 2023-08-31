package AtoZDSA.Patterns;

import java.util.Scanner;

public class ThirdPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern3(n);
    }

    private static void printPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


}
