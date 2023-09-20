package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class MaxandMinInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, -10, 34, -2};
        int[] brr = {2, 4, -3, 10, 3};

        printArr(arr, 6);
        printArr(brr, 5);

        int ans = findMax(arr, 6);
        System.out.println("Max Value: " + ans);
        int ans1 = findMin(arr, 6);
        System.out.println("Min Value: " + ans1);
    }

    private static int findMax(int[] arr, int size) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int findMin(int[] arr, int size) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
