package Java_Course_DSA.Programs;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int answer = majorityElement(nums);
        System.out.println(answer);
    }

    private static int majorityElement(int[] nums) {
        int majorityCandidate = 0;
        int count = 0;

        // Finding the potential majority candidate
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (count == 0) {
                majorityCandidate = num;
                count++;
            } else if (majorityCandidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Count the occurrences of the potential majority candidate
        int candidateCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == majorityCandidate) {
                candidateCount++;
            }
        }

        // Check if it's indeed the majority element
        if (candidateCount > nums.length / 2) {
            return majorityCandidate;
        }

        // No majority element found
        return -1;
    }
}
