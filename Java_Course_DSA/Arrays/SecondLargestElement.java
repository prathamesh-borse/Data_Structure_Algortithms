package Java_Course_DSA.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {-2, -3, -1, 1};
        int answer = secondLargest(nums);
        System.out.println(answer);
    }

    private static int secondLargest(int[] nums) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > large && nums[i] != large) {
                secondLarge = large;
                large = nums[i];
            } else if (nums[i] > secondLarge && nums[i] != large) {
                secondLarge = nums[i];
            }
        }
        return secondLarge;
    }

//    private static int secondSmallest(int[] nums) {
//        int minValue = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < minValue) {
//                secondSmallest = minValue;
//                minValue = nums[i];
//            } else if (nums[i] < secondSmallest && nums[i] != minValue) {
//                secondSmallest = nums[i];
//            }
//        }
//        System.out.println("Second Smallest Element: " + secondSmallest);
//        return secondSmallest;
//    }
}
