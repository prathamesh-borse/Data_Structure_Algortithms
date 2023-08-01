package GFG_Problems;

import java.util.Scanner;

public class Multiplication_Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }

    }
}
