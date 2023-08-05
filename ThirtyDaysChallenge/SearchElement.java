package ThirtyDaysChallenge;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1, 22, 57, 47, 34, 18, 66};
        int n = arr.length;
        int k = 98;
        int answer = search(arr, n, k);
        System.out.println(answer);
    }

    private static int search(int[] a, int n, int k) {

        for (int i = 0; i < n; i++) {
            if (a[i] == k)
                return i + 1;

        }
        return -1;
    }
}
