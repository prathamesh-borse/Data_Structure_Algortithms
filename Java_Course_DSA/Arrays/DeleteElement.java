package Java_Course_DSA.Arrays;


// Deletion of the element into array comes with following conditions:
// 1. Deleting the element by the index:
// this is the most common method to delete an element. this method shifts the subsequent elements to fill the gap with element deleted.
// -> To delete the element beginning or in the middle we need to do following steps.
/*
1. Determine the index position where you want to insert the element
2. Shift the elements from that index to array length-1 to one position to right. This will ensure that you have space
   for new element
3. and lastly assign new element to that index position.
*/

// 2. Deletion of the element from the middle of an array
// 3. Deletion of the element from the end of an array
/*Deletion of the element from the end of an array is comparatively easier than insert a middle or beginning
 * 1. Determine the last position of an array
 * 2. Assign the new element to the next position after the last element.
 * */

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int indexToDelete = 2;
//
//        for (int i = indexToDelete; i < array.length - 1; i++) {
//            array[i] = array[i + 1];
//        }
//
//        // Reduce the array size by 1
//        int[] newArray = Arrays.copyOf(array, array.length - 1);
//
//        System.out.println(Arrays.toString(newArray));

        int[] array = {1, 2, 3, 4, 5};
        int valueToDelete = 3;

        int[] newArray = deleteValueFromArray(array, valueToDelete);

        if (newArray != null) {
            // Print the new array
            System.out.println(Arrays.toString(newArray));
        } else {
            System.out.println("Value not found in the array.");
        }
    }

    public static int[] deleteValueFromArray(int[] array, int valueToDelete) {
        int indexToDelete = -1;

        // For loop checking the valueToDelete and assigning that value index of the array to indexToDelete
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToDelete) {
                indexToDelete = i;
                break;
            }
        }

        // this is checking if indexToDelete is not equal to -1
        // if it is not equal then we will be traversing from the IndexToDelete variable and assigning next index value
        // to the present index of an i value and incrementing the i value
        if (indexToDelete != -1) {
            for (int i = indexToDelete; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Reduce the array size by 1
            // here we are printing the new array with the latest values.
            int[] newArray = Arrays.copyOf(array, array.length - 1);
            return newArray;
        } else {
            return null;
        }
    }
}
