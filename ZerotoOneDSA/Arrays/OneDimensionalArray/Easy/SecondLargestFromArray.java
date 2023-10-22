package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class SecondLargestFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int ans = secondLargest(arr);
        System.out.println(ans);
        int n = arr.length - 1;
        int ans1 = secondSmallest(arr, n);
        System.out.println(ans1);
    }

    static int largestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

//    static int secondLargest(int[] arr) {
//        int secondLargest = -1;
//        int largest = largestElement(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > secondLargest && arr[i] != largest) {
//                secondLargest = arr[i];
//            }
//        }
//        return secondLargest;
//    }

    static int secondLargest(int[] arr) {
        int largest = largestElement(arr);
        int secondLargest = -1; // if the numbers are negative then use INT_MIN

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            // here we are checking the number less than the largest array number
            // and als checking if it is greater than the second-largest number
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    static int secondSmallest(int[] arr, int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

}
