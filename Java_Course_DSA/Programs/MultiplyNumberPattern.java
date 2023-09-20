package Java_Course_DSA.Programs;

import java.util.Scanner;

public class MultiplyNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        timeTable(number);
    }

    private static void timeTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
