package Java_Course_DSA.Programs;

import java.util.Arrays;

public class Replace0and1Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] answer = modifyArray(arr);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }
}
