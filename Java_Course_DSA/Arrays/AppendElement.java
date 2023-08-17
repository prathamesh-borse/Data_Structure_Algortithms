package Java_Course_DSA.Arrays;

import java.util.Arrays;

public class AppendElement {
    public static void main(String[] args) {
        // Existing array
        int[] arr = {1, 2, 3, 4, 5};

        // New element to append
        int newElement = 6;

        // Create a new array with increased size
        int[] newArray = new int[arr.length + 1];

        // Copy existing elements to the new array
        System.arraycopy(arr, 0, newArray, 0, arr.length);

        // Append the new element
        newArray[newArray.length - 1] = newElement;

        // Updated array
        System.out.println(Arrays.toString(newArray));
    }
}
