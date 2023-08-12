package Java_Course_DSA;

import java.util.ArrayList;
import java.util.List;

public class MatrixZigZagTraversal {
    public static void main(String[] args) {
        int M = 4;
        int N = 3;
        int[][] Matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        List<Integer> answer = matrixTraversal(M, N, Matrix);
        System.out.println(answer);
    }

    private static List<Integer> matrixTraversal(int m, int n, int[][] Matrix) {
        List<Integer> result = new ArrayList<>();

        if (Matrix == null || Matrix.length == 0 || Matrix[0].length == 0) {
            return result;
        }

        int rows = Matrix.length;
        int cols = Matrix[0].length;
        boolean reverse = false;

        for (int i = 0; i < cols; i++) {
            if (reverse) {
                for (int j = rows - 1; j >= 0; j--) {
                    if (i < Matrix[j].length) {
                        result.add(Matrix[j][i]);
                    }
                }
            } else {
                for (int j = 0; j < rows; j++) {
                    if (i < Matrix[j].length) {
                        result.add(Matrix[j][i]);
                    }
                }
            }
            reverse = !reverse;
        }

        return result;
    }
}
