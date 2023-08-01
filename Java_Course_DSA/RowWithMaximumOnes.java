import java.util.Scanner;

public class RowWithMaximumOnes {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {0, 0, 0},
                {0, 0, 0}
        };
        int r = 3;
        int c = 3;
        int answer = maximumOne(arr, r, c);
        System.out.println(answer);
    }

    private static int maximumOne(int[][] arr, int r, int c) {
        int maxOnesRow = 0;
        int maxOnesCount = 0;
        for (int i = 0; i < r; i++) {
            int onesCount = 0;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount < maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }
        return maxOnesRow;
    }
}
