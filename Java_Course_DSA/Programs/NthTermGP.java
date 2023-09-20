package Java_Course_DSA.Programs;

import java.util.Scanner;

public class NthTermGP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = scan.nextInt();
        System.out.print("Enter r value: ");
        int r = scan.nextInt();
        System.out.print("Enter N value: ");
        int N = scan.nextInt();
        int answer = Nth_of_GP(a, r, N);
        System.out.println("The Nth term of GP is: " + answer);
    }

    private static int Nth_of_GP(int a, int r, int N) {
        return (a * (int) (Math.pow(r, N - 1)));
    }
}

/* A geometric progression (GP) is a sequence of numbers where each number is found by multiplying the
   previous number by a fixed amount, called the common ratio

   For example, the sequence 1, 2, 4, 8, 16 is a GP with a common ratio of 2, because each number is twice
   the previous number.

   Formula: a*r^(n-1);
*/

/*
 * Write a program to find the nth term of the series.
 * Given ‘a’ the First term, ‘r’ the common ratio and ‘n’ for the number of terms in a series.

 * Example 1:
 * Input: a = 2, r = 3, N = 5
 * Output: 162
 * Explanation:

 * Constraints:
 * None
 */