package Java_Course_DSA.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens_HardQuestion {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(Arrays.asList(ans));
    }

    static List<List<String>> finalAnswer = new ArrayList<>();
    static List<String> matrix = new ArrayList<>();

    static boolean canQueenBePlacedHere(int rowIndex, int colIndex, int n) {
        for (int i = 0; i < n; i++) {
            // there is no queen on the same row
            if (matrix.get(rowIndex).charAt(i) == 'Q') {
                return false;
            }

            // there is no queen on the same column
            if (matrix.get(i).charAt(colIndex) == 'Q') {
                return false;
            }
        }

        int R = rowIndex;
        int C = colIndex;

        // there is no queen on the upper left diagonal
        while (R >= 0 && C >= 0) {
            if (matrix.get(R).charAt(C) == 'Q') {
                return false;
            }

            R--;
            C--;
        }

        R = rowIndex;
        C = colIndex;

        // there is no queen on the lower left diagonal
        while (R < n && C < n) {
            if (matrix.get(R).charAt(C) == 'Q') {
                return false;
            }

            R++;
            C++;
        }

        R = rowIndex;
        C = colIndex;

        while (R >= 0 && C < n) {
            if (matrix.get(R).charAt(C) == 'Q') {
                return false;
            }

            R--;
            C++;
        }

        R = rowIndex;
        C = colIndex;

        while (R < n && C >= 0) {
            if (matrix.get(R).charAt(C) == 'Q') {
                return false;
            }

            R++;
            C--;
        }

        return true;
    }

    // RECURSION
    // - Base Case
    // - Recursive Case
    // - Parameters of recursion/ return type
    static void recur(int rowIndex, int n) {
        // base case (STOP - n queens have been placed)
        if (rowIndex == n) {
            // insert the current chessboard in the list of solutions
            finalAnswer.add(new ArrayList<>(matrix));
            return;
        }

        // recursive case - options
        for (int colIndex = 0; colIndex < n; colIndex++) {
            // special function to check if queens don't attack each other
            if (canQueenBePlacedHere(rowIndex, colIndex, n)) {
                StringBuilder row = new StringBuilder(matrix.get(rowIndex));
                row.setCharAt(colIndex, 'Q');
                matrix.set(rowIndex, row.toString());

                // try to place queens in another rows
                recur(rowIndex + 1, n);

                // remove queen from the current position
                row.setCharAt(colIndex, '.'); // . -> is denoting an empty cell
                matrix.set(rowIndex, row.toString());
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        // STEP 1 - Create a chessboard of size n*n
        for (int i = 0; i < n; i++) {
            StringBuilder currentRow = new StringBuilder();
            for (int j = 0; j < n; j++) {
                currentRow.append(".");
            }
            matrix.add(currentRow.toString());
        }

        // STEP 2 - Call recursion
        recur(0, n);

        return finalAnswer;
    }
}
