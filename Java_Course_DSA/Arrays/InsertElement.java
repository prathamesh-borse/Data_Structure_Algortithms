package Java_Course_DSA.Arrays;

// Inserting the element into array comes with following conditions
// 1. Inserting at the beginning of an array
// -> To insert the element beginning or in the middle we need to do following steps.
/*
1. Determine the index position where you want to insert the element
2. Shift the elements from that index to array length-1 to one position to right. This will ensure that you have space
   for new element
3. and lastly assign new element to that index position.
*/

// 2. Inserting at the middle of an array
// 3. Inserting at the end of an array
/*Inserting at the end of an array is comparatively easier than insert an middle or beginning
 * 1. Determine the last position of an array
 * 2. Assign the new element to the next position after the last element.
 * */


import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 10;
        int index = 2;
        int[] ans = insertAtMiddle(arr, index, element);
        System.out.println("Insert at Middle: " + Arrays.toString(ans));

        int[] arrLast = {1, 2, 3, 4, 5};
        int elementLast = 10;
//        insertAtEnd(arrLast, elementLast);
        int[] ansInsertAtLast = insertAtEnd(arr, elementLast);
        System.out.println("Insert at Last: " + Arrays.toString(ansInsertAtLast));

    }

    private static int[] insertAtMiddle(int[] arr, int index, int element) {

        // here we have traversed index from position from last to the index
        // and checking where the last array index is greater than the index position we have specified
        // in this way we are shifting elements to the right and making space to insert new element
        // the condition will be false when the array index is not grater than the index position we have specified
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // when the condition will be false we will be assign that the element we want to insert
        arr[index] = element;

//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            System.out.print(num + " ");
//        }

        return arr;
    }

    private static int[] insertAtEnd(int[] arr, int element) {
        // Insert the element at the last position
        // Last Position will be calculated by arr.length - 1
        arr[arr.length - 1] = element;

//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            System.out.print(num + " ");
//        }
        return arr;
    }
}
