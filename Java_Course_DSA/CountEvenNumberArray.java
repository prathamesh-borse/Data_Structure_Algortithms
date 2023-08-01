import java.util.Scanner;

public class CountEvenNumberArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int answer = countEven(arr);
        System.out.println(answer);
    }

    private static int countEven(int[] arr) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
