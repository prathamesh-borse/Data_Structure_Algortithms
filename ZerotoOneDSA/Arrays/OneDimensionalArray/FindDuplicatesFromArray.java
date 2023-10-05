package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 1};
        printArray(arr, 5);

        int ans = findDuplicates(arr, 5);
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
