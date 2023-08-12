package Java_Course_DSA;

/*
* Time Complexity: O(N)
* Space Complexity: O(1)No extra space is used.
* */

public class Count_the_Digits_That_Divide_a_Number {
    public static void main(String[] args) {
        int num = 121;
        int answer = countDigits(num);
        System.out.println(answer);
    }

    private static int countDigits(int num) {
        int original = num;
        int count = 0;
        while (num != 0) {
            int remainder = num % 10;
            if (original % remainder == 0) {
                count = count + 1;
            }
            num /= 10;
        }
        return count;
    }
}
