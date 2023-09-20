package Java_Course_DSA.Programs;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        moveZeros(nums);
        int[] answer = moveZeros(nums);
        System.out.println(Arrays.toString(answer));
        moveZerosVoid(nums);
    }


    // In this method we have used two pointer approach
    // firstPointer and LastPointer
    // firstPointer will start from 0 and lastPointer from size - 1
    public static int[] moveZeros(int[] nums) {
        int size = nums.length;
        int[] newArr = new int[size];
        int firstPointer = 0;
        int lastPointer = nums.length - 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                newArr[lastPointer] = nums[i];
                lastPointer--;
            } else if (nums[i] != 0) {
                newArr[firstPointer] = nums[i];
                firstPointer++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

//    public static int[] moveZeros(int[] nums) {
//        int size = nums.length;
//        int j = 0;
//        for (int i = 0; i < size; i++) {
//            if (nums[i] != 0) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                j++;
//            }
//        }
//        return nums;
//    }


    public static void moveZerosVoid(int[] nums) {
        int size = nums.length;
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println("Move Zeros Void: " + Arrays.toString(nums));
    }
}
