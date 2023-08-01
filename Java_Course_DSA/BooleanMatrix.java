import java.util.Arrays;

import java.util.Arrays;

public class BooleanMatrix {
    public static void main(String[] args) {
        int[][] mat2 = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}};

        int[][] modifiedMat2 = modifyMatrix(mat2);

        System.out.println("\nModified Matrix 2:");
        printMatrix(modifiedMat2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] modifyMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        boolean[] rowContainsOne = new boolean[rows];

        // Step 1: Find rows containing 1 and mark them in the rowContainsOne array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    rowContainsOne[i] = true;
                    break;
                }
            }
        }

        // Step 2: Fill rows with 1 where rowContainsOne is true
        for (int i = 0; i < rows; i++) {
            if (rowContainsOne[i]) {
                Arrays.fill(mat[i], 1);
            }
        }

        return mat;
    }
}
