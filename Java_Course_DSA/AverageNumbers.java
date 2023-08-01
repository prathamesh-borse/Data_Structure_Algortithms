public class AverageNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        double answer = findAverage(arr);
        System.out.println(answer);
    }

    private static double findAverage(int[] arr) {
        int sum = 0;
        int count = arr.length;

        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        double average = (double) sum / count;
        return average;
    }
}
