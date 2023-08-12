package ThirtyDaysChallenge;

// GFG = Search an Element in an array
// Linear Search Algorithm

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int N = arr.length;
        int X = 3;
        int answer = search(arr, N, X);
        System.out.println(answer);
    }

    private static int search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
