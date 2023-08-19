
// 26. Remove Duplicates from Sorted Array

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
//        int size = nums.size();
//        for (int i = 0; i < size; i++) {
//            System.out.print(nums.get(i) + " ");
//        }

//        List<Integer> list = removeDuplicates2(nums);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

        int ans = removeDuplicates2(nums);
        System.out.println(ans);
//        System.out.println(Arrays.toString(ans));

    }

    public static int removeDuplicates2(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}