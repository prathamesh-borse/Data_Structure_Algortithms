package Java_Course_DSA.BinarySearch;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        int ans = findDuplicateUsingBinarySearch(nums);
        System.out.println(ans);
    }

    private static int findDuplicate(int[] nums) {
        int n = nums.length;
        int sumofTotalElements = 0, sumOfNNaturalNumbers = 0;
        for (int i = 0; i < n; i++) {
            sumofTotalElements += nums[i];
        }

        for (int i = 0; i < n; i++) {
            sumOfNNaturalNumbers += i;
        }

        System.out.println(sumofTotalElements);
        System.out.println(sumOfNNaturalNumbers);

        int ans = sumofTotalElements - sumOfNNaturalNumbers;
        System.out.println(ans);
        return ans;
    }

    private static int findDuplicateUsingBinarySearch(int[] nums) {
        int n = nums.length, maximum = 0, ans = 0;
        // find maximum number
        for (int i = 0; i < n; i++) {
            maximum = Math.max(maximum, nums[i]);
        }

        // search range
        int s = 1;
        int e = maximum;
        while (s <= e) {
            int mid = (s + e) / 2;

            // you need to find the maximum point where the condition is satisfied
            if (isPossible(mid, nums) == true) {
                // go right
                ans = Math.max(ans, mid);
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int mid, int[] nums) {
        int countSmallerNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < mid) {
                countSmallerNumber++;
            }
        }

        // before repeated elements
        if (countSmallerNumber == (mid - 1)) {
            return true;
        } else {
            return false;
        }
    }
}
