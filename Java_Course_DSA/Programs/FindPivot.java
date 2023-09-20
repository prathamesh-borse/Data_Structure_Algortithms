package Java_Course_DSA.Programs;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int ans = findPivot(arr);
        System.out.println(ans);
    }

    private static int findPivot(int[] arr) {
        int totalSum = 0, leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];

        }

        for (int i = 0; i < arr.length; i++) {
            rightSum = totalSum - leftSum - arr[i];
            if (rightSum == leftSum) return i;
            leftSum += arr[i];
        }

        return -1;
    }
}
