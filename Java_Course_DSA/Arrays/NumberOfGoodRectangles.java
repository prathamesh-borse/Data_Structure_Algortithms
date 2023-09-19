package Java_Course_DSA.Arrays;

import java.util.Arrays;

public class NumberOfGoodRectangles {
    public static void main(String[] args) {
        int[][] mat = {{2, 3}, {3, 7}, {4, 3}, {3, 7}};
        int ans = countGoodRectangles(mat);
        System.out.println(ans);
    }

    private static int countGoodRectangles(int[][] mat) {
        int maxLen = 0, count = 0;

        for (int i = 0; i < mat.length; i++) {
            int minSide = Math.min(mat[i][0], mat[i][1]);
            if (minSide > maxLen) {
                maxLen = minSide;
                count = 1;
            } else if (minSide == maxLen) {
                count++;
            }
        }
        return count;

    }
}
