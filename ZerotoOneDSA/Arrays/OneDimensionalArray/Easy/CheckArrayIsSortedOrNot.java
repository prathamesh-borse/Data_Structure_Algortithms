package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int n = arr.length;
        boolean ans = check(arr);
        System.out.println(ans);
    }

    static boolean checkSortedOrNot(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    static boolean check(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                // If an element is greater than the next element, increments the count.
                count++;
            }
        }

        // If the count is 0 = array is sorted
        if (count == 0) {
            return true;
        }
        // If the count is 1 = array is not sorted
        else if (count > 1) {
            return false;
        }
        // If the first element is greater than or equal to the last element, the array is considered sorted
        else if (a[0] >= a[n - 1]) {
            return true;
        } else {
            return false;
        }
    }
}
