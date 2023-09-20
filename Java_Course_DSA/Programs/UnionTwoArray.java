package Java_Course_DSA.Programs;

/*
 * Union of Two Array
 * this operation is useful for = merging data sets, finding common elements or creating sets with unique elements
 *
 * */

import java.util.*;

public class UnionTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergeArray = computeUnion(arr1, arr2);
        System.out.println(Arrays.toString(mergeArray));
    }


    // here in this method we have created one set of Integer
    // In that set we have included the element of arr1 and arr2
    // next created one array of that set size
    // next we will print the elements from that array
    private static int[] unionTwoArray(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            unionSet.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            unionSet.add(arr2[j]);
        }

        int[] unionArray = new int[unionSet.size()];
        int index = 0;
        for (int i = 1; i <= unionArray.length; i++) {
            unionArray[index++] = i;
        }
        return unionArray;
    }

    // Approach 2: Sorting and merging
    // In this approach we first sort both the arrays and merge them while skipping elements.
    private static int[] computeUnion(int[] arr1, int[] arr2) {
        Arrays.sort(arr1); // sorting both the arrays
        Arrays.sort(arr2);

        int i = 0, j = 0;
        List<Integer> unionList = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                // checking arr1 0th element is less than arr2 element if it is less than
                // adding first array element inside the arraylist and incrementing the index
                unionList.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                // checking arr1 0th element is greater than arr2 element if it is greater than
                // adding second array element inside the arraylist and incrementing the index
                unionList.add(arr2[j]);
                j++;
            } else {
                // if it is not less than or greater than then simply put the first array element
                // inside the arraylist and increment both index of both the array
                unionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        // here this condition will be false when ith index will not equal to the current i index
        // this loop will be executed after assigning all first array values to the list
        while (i < arr1.length) {
            unionList.add(arr1[i]);
            i++;
        }

        // this loop will be used to insert the second array elements values inside the list
        // and incrementing the index
        while (j < arr2.length) {
            unionList.add(arr2[j]);
            j++;
        }

        int[] unionArray = new int[unionList.size()];

        // assigning the list values to the array
        for (int k = 0; k < unionList.size(); k++) {
            unionArray[k] = unionList.get(k);
        }

        return unionArray;
    }
}
