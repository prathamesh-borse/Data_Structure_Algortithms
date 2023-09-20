package Java_Course_DSA.Programs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}


/*
 * Binary Search
 * finding the specific element in the sorted array.
 * It follows the divide and conquer technique and reducing the search space in half with each iteration.
 *
 *
 * Algorithm:
 * 1. Start with the entire sorted array
 * 2. Calculate the middle element of the array
 * 3. Compare the middle element with the target element:
 *   1. If they are equal, the search is successful, and the index is returned.
 *   2. If the middle element is greater than the target element, repeat the process on the left half of the array.
 *   3. If the middle element is less than the target element, repeat the process on the right half of the array.
 * 4. Repeat steps 2-3 until the target element is found or the search space is empty.
 * 5. If the target element is not found after exhausting the search space, return a special value (e.g., -1) to
 *    indicate that the element is not present in the array.
 *
 * */