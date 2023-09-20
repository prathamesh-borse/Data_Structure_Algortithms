package Java_Course_DSA.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] ans = findDiagonalOrder(mat);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findDiagonalOrder(int[][] mat) {

        // num of row
        int n = mat.length;
        // num of columns
        int m = mat[0].length;

        List<Integer> resultList = new ArrayList<>(); // for storing the final output
        int reverse = 1; // for changing the direction

        // first set of starting element (first row)
        for (int i = 0; i < m; i++) {
            List<Integer> elements = currentElementsInDownwardDirection(0, i, n, m, mat);
            if (reverse % 2 != 0) {
                Collections.reverse(elements);
            }

            for (int j = 0; j < elements.size(); j++) {
                resultList.add(elements.get(j));
            }
            reverse++;
        }


        // Second set of starting point (Last Column)
        for (int i = 1; i < n; i++) {
            List<Integer> elements = currentElementsInDownwardDirection(i, m - 1, n, m, mat);
            if (reverse % 2 != 0) {
                Collections.reverse(elements);
            }

            for (int j = 0; j < elements.size(); j++) {
                resultList.add(elements.get(j));
            }
            reverse++;
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;

    }

    private static List<Integer> currentElementsInDownwardDirection(int r, int c, int n, int m, int[][] mat) {
        List<Integer> currentElements = new ArrayList<>();
        while (c >= 0 && r < n) {
            currentElements.add(mat[r][c]);
            r++;
            c--;
        }
        return currentElements;
    }
}
