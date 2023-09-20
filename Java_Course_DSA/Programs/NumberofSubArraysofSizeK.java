package Java_Course_DSA.Programs;

public class NumberofSubArraysofSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        int ans = numberofSubArrays(arr, k, threshold);
        System.out.println(ans);
    }

    private static int numberofSubArrays(int[] arr, int k, int threshold) {
        int count = 0;
        int a = 0, b = k - 1, n = arr.length;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }

        if (sum >= threshold * k) {
            count++;
        }

        while (b <= n - 2) {
            sum -= arr[a];
            sum += arr[b + 1];
            a++;
            b++;

            if (sum >= threshold * k) {
                count++;
            }
        }
        return count;
    }
}
