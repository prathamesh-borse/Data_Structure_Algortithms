public class AverageNumber2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 0}
        };
        double answer = findAverage(arr);
        System.out.println(answer);
    }

    private static double findAverage(int[][] arr) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        double average = (double) sum / count;
        return average;
    }
}
