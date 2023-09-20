package Java_Course_DSA.Programs;

import java.util.Scanner;

public class ReverStarPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        reverseStar(number);
    }

    public static void reverseStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
