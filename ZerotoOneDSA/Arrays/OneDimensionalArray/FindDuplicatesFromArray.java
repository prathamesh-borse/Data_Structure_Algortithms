package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 4, 7, 1, 3, 6};
        printArray(arr, 9);

        int ans = findDuplicates(arr, 9);
        System.out.println(ans);
    }

    static int findDuplicates(int[] arr, int size) {
        int ans = 0;
        for (int i = 0; i < size; i++) {
            ans = ans ^ arr[i];
        }

        for (int i = 0; i < size; i++) {
            ans = ans ^ i;
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
