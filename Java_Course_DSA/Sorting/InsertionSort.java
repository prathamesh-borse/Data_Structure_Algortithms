package Java_Course_DSA.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1};
        insertionSort(arr);
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.println(num);
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
