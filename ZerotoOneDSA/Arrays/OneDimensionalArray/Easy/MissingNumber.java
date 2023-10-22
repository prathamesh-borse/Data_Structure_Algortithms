package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int n = 5;
        int ans = missingNumberLeetcode(arr);
        System.out.println(ans);
    }

//    static int missingNumber(int[] arr, int N) {
//        int xor1 = 0, xor2 = 0;
//        for (int i = 0; i < N - 1; i++) {
//            xor2 = xor2 ^ arr[i];
//            xor1 = xor1 ^ (i + 1);
//        }
//        xor1 = xor1 ^ N;
//        return (xor1 ^ xor2);
//    }

    static int missingNumberLeetcode(int[] arr) {
        int xor1 = 0, xor2 = 0, N = arr.length + 1; // Increase N by 1 to include the missing number
        for (int i = 0; i < N-1; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        return (xor1 ^ xor2);
    }

}
