import java.util.Scanner;

public class ReturnSumofNumbers {
    public static void main(String args[]) {
        int[] arr = {1, 4, 2};
        int answer = sumNNumbers(arr);
        System.out.println(answer);
    }

    public static int sumNNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
