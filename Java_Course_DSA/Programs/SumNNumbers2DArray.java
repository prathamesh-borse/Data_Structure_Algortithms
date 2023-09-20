package Java_Course_DSA.Programs;

import java.util.Scanner;

public class SumNNumbers2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int answer = sumofnnumbers(arr);
        System.out.println(answer);
    }

    private static int sumofnnumbers(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}

