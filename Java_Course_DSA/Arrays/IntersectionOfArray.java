package Java_Course_DSA.Arrays;

/*
 * Intersection Of Array = common elements that exists between two or more arrays
 *
 *
 * */


import java.util.*;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 5, 6, 8};
        int[] ans = computeIntersection2(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }

    /*    Approach 1: Using Hash Set
    //    Here is the step-by-step process:
    //    1. Create an empty hash set.
    //    2. Iterate over the first array and add each element to the hash set.
    //    3. Create an empty result array.
    //    4. Iterate over the second array.
    //        4.1 If the element exists in the hash set, add it to the result array.
    //    5. Return the result array containing the intersection elements.
     */
    private static int[] computeIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            intersectionSet.add(arr1[i]);
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (intersectionSet.contains(arr2[i])) {
                resultList.add(arr2[i]);
                intersectionSet.remove(i); // If duplicates are not allowed in the result, remove from set
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        System.out.println(Arrays.toString(resultArray));
        return resultArray;
    }

    // Approach 2: Sorting and Two Pointers
    private static int[] computeIntersection2(int[] arr1, int[] arr2) {
        // Step 1: Sort both the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 2: Initialize two pointers one for each array, pointing to the first element.
        int i = 0;
        int j = 0;

        // Step 3: Create an empty result array.
        List<Integer> list = new ArrayList<>();

        // Step 4: Iterate until either of the pointers reaches the end of its respective array.
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] resultArray = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            resultArray[k] = list.get(k);
        }
        System.out.println(Arrays.toString(resultArray));
        return resultArray;
    }
}
