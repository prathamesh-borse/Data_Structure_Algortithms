package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        printArray(arr, 5);

        reverse(arr, 5);
        printArray(arr, 5);
    }

    private static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void reverse(int[] arr, int size) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
