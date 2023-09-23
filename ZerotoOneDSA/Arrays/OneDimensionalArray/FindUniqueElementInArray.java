package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class FindUniqueElementInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 6, 2};
        printArray(arr, 7);

        int ans = findUnique(arr, 7);
        System.out.println(ans);
    }

    static int findUnique(int[] arr, int size) {
        int ans = 0;
        for (int i = 0; i < size; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
