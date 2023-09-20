package Java_Course_DSA.Programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] answer = fibonacci(n);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static int[] fibonacci(int n) {
        int answer[] = new int[n];
        answer[0] = 0;
        if (n == 1) {
            return answer;
        }
        answer[1] = 1;
        for (int i = 2; i <= (n - 1); i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }
}

/* Question
Write a Program to Generate Fibonacci Numbers.
The number is said to be in a Fibonacci series if each subsequent number is the sum of the previous two numbers.

Example 1:
Input: n = 5
Output: [0,1,1,2,3]

Explanation:

Constraints:
0<count<10^4
*/