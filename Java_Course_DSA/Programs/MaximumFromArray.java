package Java_Course_DSA.Programs;

public class MaximumFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3};
        int answer = findMax(arr);
        System.out.println(answer);
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
