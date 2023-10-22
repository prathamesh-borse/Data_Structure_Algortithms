package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        int n = arr.length;
        int ans = findMajorityElement(arr, n);
        System.out.println(ans);
    }

    static int findMajorityElement(int[] arr, int n) {
        int cnt = 0;
        int ele = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) cnt1++;
        }
        if (cnt1 > n / 2) {
            return ele;
        }
        return -1;
    }
}
