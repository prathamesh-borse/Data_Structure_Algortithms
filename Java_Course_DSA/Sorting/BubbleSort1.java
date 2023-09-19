package Java_Course_DSA.Sorting;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] A = {1, 3, 2, 5, 4};
        int ans = bubbleSort(A);
        System.out.println(ans);
    }


    public static int bubbleSort(int[] A) {
        int count = 0;
        int n = A.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            count = count + 1;
            for (int i = 0; i < n - 1; i++) {
                if (A[i] > A[i + 1]) {
                    swap(A, i, i + 1);
                    swapped = true;
                }
            }
        }
        return count;
    }

    public static void swap(int[] arr, int i, int j) {
        // swapping first and last element
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
