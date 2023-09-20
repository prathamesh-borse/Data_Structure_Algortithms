package Java_Course_DSA.Programs;

import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int answer = sumofnnumbers(number);
        System.out.println("The sum of first" + number + " is: " + answer);
    }

    private static int sumofnnumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
