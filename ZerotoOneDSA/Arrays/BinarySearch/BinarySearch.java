package ZerotoOneDSA.Arrays.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] even = {2, 4, 6, 8, 12, 18};
        int[] odd = {3, 8, 11, 14, 16};

        int evenIndex = binarySearch(even, 6, 12);
        System.out.println("Index of 12 is: " + evenIndex);

        int oddIndex = binarySearch(odd, 5, 14);
        System.out.println("Index of 14 is: " + oddIndex);
    }

    static int binarySearch(int[] arr, int size, int key) {
        int start = 0;
        int end = size - 1;

        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }

            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}
