package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        int ans = findMaximumConsecutiveOnes(arr);
        System.out.println(ans);
    }

    static int findMaximumConsecutiveOnes(int[] arr) {
        int maxi = 0, cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }
        return maxi;
    }
}
