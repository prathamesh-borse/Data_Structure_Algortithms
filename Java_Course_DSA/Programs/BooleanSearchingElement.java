package Java_Course_DSA.Programs;

import java.util.Scanner;

public class BooleanSearchingElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int x = 4;
        boolean answer = findElement(arr, x);
        System.out.println(answer);
    }

    private static boolean findElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                return true;
            }
        }
        return false;
    }
}
