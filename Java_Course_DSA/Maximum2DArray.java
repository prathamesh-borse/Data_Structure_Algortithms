public class Maximum2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int answer = findMax(arr);
        System.out.println(answer);
    }

    private static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
