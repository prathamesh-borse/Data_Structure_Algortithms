package Java_Course_DSA.Programs;

import java.util.Arrays;

public class FindGCD {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};
        int answer = findGCD(nums);
        System.out.println(answer);
    }

//    public static int gcd(int a, int b) {
//        int gcdOfTwoNumbers = 1;
//
//        for (int i = 2; i <= Math.min(a, b); i++) {
//            if (a % i == 0 && b % i == 0) {
//                gcdOfTwoNumbers = i;
//            }
//        }
//
//        return gcdOfTwoNumbers;
//    }


    public static int findGCD(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        int maxNumber = 0, smallNumber = nums[0];
        for (int i = 1; i < size; i++) {
            if (nums[i] > i) {
                maxNumber = nums[i];
            }
        }
        System.out.println("Maximum Number: " + maxNumber);
        System.out.println("Smallest Number: " + smallNumber);
        while (maxNumber != 0) {
            int remainder = smallNumber % maxNumber;
            smallNumber = maxNumber;
            maxNumber = remainder;
        }
        System.out.println("Maximum Number: " + maxNumber);
        System.out.println("Smallest Number: " + smallNumber);
        return smallNumber;
    }


    // Approach 2: Euclidean Algorithm
    public int gcd1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd1(b, a % b);
    }

    public int findGCD1(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            mini = Math.min(mini, x);
            maxi = Math.max(maxi, x);
        }
        return gcd1(mini, maxi);
    }
}
