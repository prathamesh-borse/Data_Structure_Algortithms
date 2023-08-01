public class NumberOfOperations {
    public static void main(String[] args) {
        int[] arr = {4, 64, 28, 12, 28};
        int n = arr.length;
        int answer = numberOfOperations(arr, n);
        System.out.println("The number of operations are: " + answer);
    }

    private static int numberOfOperations(int[] arr, int n) {

        int minOperations = 0;
        for (int i = 0; i < n; i++) {
            int operations = 0;
            if (arr[i] % 2 == 0) {
                arr[i] /= 2;
                operations++;
            }
            minOperations = Math.min(minOperations, operations);
        }
        return minOperations;
    }

}
