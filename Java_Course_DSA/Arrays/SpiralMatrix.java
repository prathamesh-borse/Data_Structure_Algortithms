package Java_Course_DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {7},
                {9},
                {6}
        };
        List<Integer> ans = spiralOrder(array);
        System.out.println(Arrays.asList(ans));
    }

    public static List<Integer> spiralOrder(int[][] a) {
        List<Integer> resultList = new ArrayList<>();

        // checking if the matrix is null or contains zero element or not
        if (a == null || a.length == 0) {
            return resultList;
        }

        // creating four variables and assigning values according to the matrix
        int rows = a.length, cols = a[0].length;
        int top = 0;
        int left = 0;
        int right = cols - 1;
        int bottom = rows - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                resultList.add(a[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                resultList.add(a[i][right]);
            }
            right--;

            if (top <= bottom) { // Check if there are more rows to go down
                for (int i = right; i >= left; i--) {
                    resultList.add(a[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) { // Check if there are more columns to go left
                for (int i = bottom; i >= top; i--) {
                    resultList.add(a[i][left]);
                }
                left++;
            }
        }

        return resultList;
    }
}
