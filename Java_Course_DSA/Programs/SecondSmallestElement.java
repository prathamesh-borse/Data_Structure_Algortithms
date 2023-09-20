package Java_Course_DSA.Programs;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 4, 6};
        int answer = secondSmallest(nums);
        System.out.println(answer);
    }

    private static int secondSmallest(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {
                secondSmallest = minValue;
                minValue = nums[i];
            } else if (nums[i] < secondSmallest && nums[i] != minValue) {
                secondSmallest = nums[i];
            }
        }
        System.out.println("Second Smallest Element: " + secondSmallest);
        return secondSmallest;
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
