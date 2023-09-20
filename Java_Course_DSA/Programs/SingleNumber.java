package Java_Course_DSA.Programs;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
//        int ans = singleNumber(nums);
//        System.out.println(ans);
        int ans = singleNumber2(nums);
        System.out.println(ans);
    }

    private static int singleNumber(int[] nums) {
        int size = nums.length;
        int[] freqArray = new int[size + 1];
        for (int i = 0; i < size; i++) {
            freqArray[nums[i]]++;
        }
        int index;
        for (index = 0; index < freqArray.length; index++) {
            if (freqArray[index] == 1)
                System.out.println(index);
        }
        System.out.println(Arrays.toString(freqArray));
        return index;
    }

    private static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int answer = -1;

        for (int i = 0; i < size; i = i + 2) {
            if (i + 1 == size) {
                answer = nums[i];
                System.out.println("Index: " + nums[i]);
            } else if (nums[i] != nums[i + 1]) {
                answer = nums[i];
                System.out.println("Index: " + nums[i]);
            }
        }
        return answer;

    }
}

/*
 * 3 Ways -
 * 1. Frequency Array (To save space use HashMap or map)
 * 2. Sorting and Two Pointer
 * 3. XOR (BIT Manipulation)
 * */
