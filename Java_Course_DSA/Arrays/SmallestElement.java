package Java_Course_DSA.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] nums = {-10, 1, 5, 6, -11};
        int answer = findLargestElement(nums);
        System.out.println(answer);
    }

    public static int findLargestElement(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        System.out.println("Maximum Element: " + minValue);
        return minValue;
    }
}
