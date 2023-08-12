package ThirtyDaysChallenge;

public class ImmediateSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        int n = arr.length;
        smallerElement(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    private static void smallerElement(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
        arr[n - 1] = -1;
    }
}
