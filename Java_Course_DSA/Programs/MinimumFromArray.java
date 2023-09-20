package Java_Course_DSA.Programs;

public class MinimumFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 65};
        int answer = findMin(arr);
        System.out.println(answer);
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
