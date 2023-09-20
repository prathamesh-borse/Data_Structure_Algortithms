package Java_Course_DSA.Programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int fact = scan.nextInt();
        long answer = factorial(fact);
        System.out.println("The factorial of " + fact + " is: " + answer);

    }

    private static long factorial(int fact) {
        if (fact == 0) {
            return 1;
        } else {
            return fact * factorial(fact - 1);
        }
    }
}
