package AtoZDSA.Patterns;

import java.util.Scanner;

public class SixthPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern5(n);
    }

    private static void printPattern5(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print(n - j + 1);
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n - j + 1);
            }

            System.out.println();
        }

//        System.out.println();
//        for (int j = 1; j <= n - 1; j++) {
//            System.out.print(j);
//        }
//        System.out.println();
//        for (int j = 1; j <= n - 2; j++) {
//            System.out.print(j);
//        }
//        System.out.println();
//        for (int j = 1; j <= n - 3; j++) {
//            System.out.print(j);
//        }
//        System.out.println();
//        for (int j = 1; j <= n - 4; j++) {
//            System.out.print(j);
//        }
    }
}
