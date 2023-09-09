package Java_Course_DSA.NumberSystem;

public class SingleNumberTwoUsingXOR {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }

    public static int singleNumber(int[] nums) {

        int bits[] = new int[33];
        // 0-31 indexes --> positive number
        // 32 index --> for negative number (sign of negative number )

        int n = nums.length;
        // O(N*31)
        for (int i = 0; i < n; i++) {
            long x = (nums[i]);
            x = Math.abs(x);
            int index = 0;

            while (x > 0) {
                if (x % 2 != 0) {
                    bits[index]++;
                }
                x /= 2;
                index++;
            }

            if (nums[i] < 0) {
                bits[32]++;
            }
        }

        for (int i = 0; i < 33; i++) {
            bits[i] = bits[i] % 3; // we are removing all bits which are coming from those numbers present thrice
        }

        long answer = 0;
        // binary number
        // 10 --> 0101 (in bits array)
        // In bits arrays we are having binary representation reversed
        // 0 - 31 (left -> right )

        // binary representation into decimal number
        for (int i = 0; i < 32; i++) {
            if (bits[i] == 1) // ith bit is set
            {
                // answer+=(long)(Math.pow(2,i));
                answer = answer | (1 << i);
            }
        }

        // 32 bit is 1 this means number is negative
        if (bits[32] == 1) {
            answer = answer * -1l;
        }

        return (int) answer;
    }

    private static int singleNumber2(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
