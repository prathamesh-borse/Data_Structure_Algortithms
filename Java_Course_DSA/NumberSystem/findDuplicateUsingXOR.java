package Java_Course_DSA.NumberSystem;

public class findDuplicateUsingXOR {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    private static int findDuplicate(int[] nums) {
        int maxium = 0, XOROfNaturalNumbers = 0, XOROfarray = 0;
        for (int i = 0; i < nums.length; i++) {
            maxium = Math.max(maxium, nums[i]);
        }
        System.out.println("maximum number: " + maxium);

        for (int i = 1; i <= maxium; i++) {
            XOROfNaturalNumbers = XOROfNaturalNumbers ^ i;
        }

        System.out.println("XOR OF N natural numbers: " + XOROfNaturalNumbers);


        for (int i = 0; i < nums.length; i++) {
            XOROfarray = XOROfarray ^ nums[i];
        }

        System.out.println("XOR of array: " + XOROfarray);


        int repeatedNumber = XOROfarray ^ XOROfNaturalNumbers;

        return repeatedNumber;
    }
}
