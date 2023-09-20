package Java_Course_DSA.Programs;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = transpose(mat);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
        }
    }

    public static int[][] transpose(int[][] matrix) {
        // number of rows
        int m = matrix.length;
        // number of columns
        int n = matrix[0].length;

        // new array with existing rows and columns
        int[][] result = new int[n][m];

        // traverse in the existing array and convert rows into column in new array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
