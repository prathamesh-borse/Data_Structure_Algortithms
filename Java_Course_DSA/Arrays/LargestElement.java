package Java_Course_DSA.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {1, 20, -10, 30};
        int answer = findLargestElement(nums);
        System.out.println(answer);
    }

    public static int findLargestElement(int[] nums) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }
        System.out.println("Maximum Element: " + maxElement);
        return maxElement;
    }
}
