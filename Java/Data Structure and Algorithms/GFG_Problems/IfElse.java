package GFG_Problems;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = sc.nextInt();
        System.out.println("Enter second number:");
        int m = sc.nextInt();
        sc.close();
        System.out.println(compareNM(n, m));
    }

    static String compareNM(int n, int m) {
        if(n == m) {
            return "equal";
        }else if(n < m) {
            return "lesser";
        }else {
            return "greater";
        }
    }
}
