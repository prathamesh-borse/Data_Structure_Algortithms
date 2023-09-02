package Java_Course_DSA.NumberSystem;

import java.util.Collections;

public class BaseSeven {
    public static void main(String[] args) {
        int num = -7;
        String ans = convertToBaseSeven(num);
        System.out.println(ans);
    }

    private static String convertToBaseSeven(int num) {
        if (num == 0) return "0";
        String ans = "";
        int neg = 0;
        if (num < 0) {
            neg = 1;
            num = Math.abs(num);
        }
        while (num != 0) {
            int remainder = num % 7;
            System.out.println("Remainder: " + remainder);
            ans += remainder;
            System.out.println("ans: " + ans);
            num /= 7;
        }
        if (neg == 1) ans += "-";
        StringBuffer sbf = new StringBuffer(ans);
        sbf.reverse();
        return String.valueOf(sbf);
    }
}
