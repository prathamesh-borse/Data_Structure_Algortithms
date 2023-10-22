package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;

// Brute = Sort the array = For Loop to check Second Largest =  TC = O(N Log N) + O(N)
// Better = TC = O(N) + O(N) = O(2N)
// Optimal = TC = O(N)

public class SecondLargestandSecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, 7};
        int n = arr.length;
        int[] ans = getSecondOrderElements(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    static int secondLargest(int[] a, int n) {
        int largest = a[0];
        int slargest = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > slargest) {
                slargest = a[i];
            }
        }
        return slargest;
    }

    static int secondSmallest(int[] a, int n) {
        int smallest = a[0];
        int ssmallest = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] != smallest && a[i] < ssmallest) {
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }

    static int[] getSecondOrderElements(int[] a, int n) {
        int slargest = secondLargest(a, n);
        int ssmallest = secondSmallest(a, n);

        int[] arr = {slargest, ssmallest};
        return arr;
    }
}
