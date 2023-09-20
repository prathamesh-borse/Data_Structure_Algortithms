package Java_Course_DSA.Programs;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int answer = numIdenticalPairs(nums);
        System.out.println(answer);
    }

    public static int numIdenticalPairs(int[] nums) {
        int size = nums.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count = count + 1;
                    System.out.println(i + " " + j);
                }
            }
        }

        return count;
    }
}


/*
* Approach 2:  O(n) solution
The efficient method is to used the unordered-map which stores the frequency of array elements.
* After storing the frequency of each element iterate over the map and get the count (x) of element the count of
* Identical Pairs formed by that element will be (x*(x-1)/2) increment our ans variable by (x(x-1)/2)*.

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int a:nums){
            if(!m.containsKey(a)){
                m.put(a, 1);
            }
            else {
                m.put(a, m.get(a) + 1);
            }
        }
        int ans=0;
        for(Integer a:m.values())
        {
            ans+=(a*(a-1)/2);
        }
        return ans;
    }
}
* */