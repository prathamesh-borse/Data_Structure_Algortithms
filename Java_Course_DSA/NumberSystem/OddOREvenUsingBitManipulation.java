package Java_Course_DSA.NumberSystem;

public class OddOREvenUsingBitManipulation {
    public static void main(String[] args) {
        int num = 8;
        String ans = isEvenOrOdd(num);
        System.out.println(ans);
    }

    private static String isEvenOrOdd(int num) {
        if ((num & (1 << 0)) == 0) return "even";
        else return "odd";
    }
}

/*
* number: 13 ; 13 in binary (1101)
* number 1 ; 1 in binary (0001)
* by doing logical AND (for doing and both the bits should be 1 else it will return 0)
*      1101
*    &
*      0001
*    -------
*      0001
*
*  The LSB (least significant bit) is set to 1 hence it is odd.
* */

