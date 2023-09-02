package Java_Course_DSA.NumberSystem;

public class OddOREvenUsingBitManipulation {
    public static void main(String[] args) {
        int num = 13;
        String ans = isEvenOrOdd(num);
        System.out.println(ans);
    }

    private static String isEvenOrOdd(int num) {
        if ((num & (1 << 0)) == 0) return "even";
        else return "odd";
    }
}
