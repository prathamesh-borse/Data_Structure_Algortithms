package Java_Course_DSA.Programs;

/*
 * 1. Take Two variable
 * 2. max_until = 0, ma = Integer.MIN_VALUE;
 * 3. traverse the string till string length
 * 4. and in that if that character is equal to 0 replace it 1 or if it is 1 replace it with -1
 * 5. int x = (c == '0') ? 1: -1
 * 6. max_until += x;
 * 7. and later check max_until greater than maximum answer then assign max_until to ma =
 * 8. if(max_until > ma) ma = max_until
 * 9. if(max_until < 0) max_until = 0 : we are doing this because we don't want max_until to go in negative.
 * 10. lastly return ma;
 *
 * */


public class Maximum_Difference {
    public static void main(String[] args) {
        String s = "1010001";
        int maxDifference = getMaxDifference(s);
        System.out.println(maxDifference);
    }

    private static int getMaxDifference(String s) {
        int max_until = 0, ma = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int x = (c == '0' ? 1 : -1);
            max_until += x;
            if (max_until > ma) {
                ma = max_until;
            }
            if (max_until < 0) {
                max_until = 0;
            }
        }
        return ma;
    }
}