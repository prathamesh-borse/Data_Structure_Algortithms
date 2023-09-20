package Java_Course_DSA.Programs;

public class sumofnumbersinrange {
    public static void main(String[] args) {
        int[] interval = new int[2];
        interval[0] = 1;
        interval[1] = 5;
        int sum = sum_of_numbers_in_range(interval);
        System.out.println("The sum is: " + sum);
    }

    private static int sum_of_numbers_in_range(int[] interval) {
        int sum = 0;
        int low = interval[0];
        int high = interval[1];
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        return sum;
    }
}

/*
* Given the range as integer input, write a program to find the sum of all the numbers
* that lay in the given interval.

Example 1:
Input: interval = [1,5]
Output: 15
Explanation:

Constraints:
10^−4 <= interval[i]<=10^4

* */
