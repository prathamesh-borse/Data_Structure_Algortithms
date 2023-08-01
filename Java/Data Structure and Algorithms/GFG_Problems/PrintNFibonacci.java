package GFG_Problems;

import java.util.Scanner;

public class PrintNFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            fibonacci(n);
            scan.close();
        }
    }

    static void fibonacci(int n) {
        int result, firstterm = 1, secondterm = 1;
        System.out.println(firstterm);
        System.out.println(secondterm);
        for(int i=3;i<=n;i++) {
            result = firstterm + secondterm;
            System.out.println(result);
            firstterm = secondterm;
            secondterm = result;
        }
    }
}
