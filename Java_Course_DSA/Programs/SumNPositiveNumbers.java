package Java_Course_DSA.Programs;

import java.util.Scanner;

public class SumNPositiveNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int answer = sumofnnumbers(arr);
        System.out.println(answer);
    }

    private static int sumofnnumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}

