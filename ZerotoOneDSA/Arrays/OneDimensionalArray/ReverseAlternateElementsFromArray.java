package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class ReverseAlternateElementsFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2};
        printArray(arr, 5);

        reverseAlternate(arr, 5);
        printArray(arr, 5);
    }


    static void reverseAlternate(int[] arr, int size) {
        for (int i = 0; i < size; i += 2) {
            if (i + 1 < size) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
