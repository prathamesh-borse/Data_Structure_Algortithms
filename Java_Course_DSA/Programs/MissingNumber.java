package Java_Course_DSA.Programs;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int number = missingNumber(nums);
        System.out.println(number);
    }

    public static int missingNumber(int[] nums) {
        int size = nums.length;
        int sumArray = 0, originalTotalSum = 0;
        for (int i = 1; i <= size; i++) {
            originalTotalSum += i;
        }
        for (int i = 0; i < size; i++) {
            sumArray += nums[i];
        }
        System.out.println("original Sum: " + originalTotalSum);
        System.out.println("Sum Array:" + sumArray);
        return originalTotalSum - sumArray;
    }
}
