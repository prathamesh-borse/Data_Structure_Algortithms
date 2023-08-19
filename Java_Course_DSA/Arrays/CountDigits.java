package Java_Course_DSA.Arrays;

import static java.lang.Math.log10;

public class CountDigits {
    public static void main(String[] args) {
        int n = 778957;
        int answer = countDigitsLogarithmic(n);
        System.out.println(answer);
    }

//    public static int countDigits(int n) {
//        int num = n, lastdigit, count = 0;
//        while (num > 0) {
//            lastdigit = num % 10;
//            if ((num % lastdigit == 0) && (lastdigit != 0)) {
//                count++;
//            }
//            num = num / 10;
//
//        }
//        return count;
//    }

//    public static long countDigits(long n) {
//        long num = n, count = 0;
//        while (num > 0) {
//            count++;
//            num = num / 10;
//
//        }
//        return count;
//    }

    public static int countDigitsLogarithmic(long n) {
        int cnt = (int) (log10(n)) + 1;
        return cnt;
    }

    // if n is dividing by 10 = will say TC = O(log10 N)
    // if n is dividing by 5 = will say TC = O(log5 N)
    // if n is dividing by 2 = will say TC = O(log2 N)

    // log base 10 to any number will get the value in float and if we add + 1 to it
    // 3.81... + 1
    // 4.81... = from this if we take the integer part it will be = 4
}
