public class Minimum2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int answer = findMin(arr);
        System.out.println(answer);
    }

    private static int findMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}

