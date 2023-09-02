package Java_Course_DSA.NumberSystem;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 7;
        String ans = decimaltoBinary(n);
        System.out.println(ans);
    }

    private static String decimaltoBinary(int n) {
        int num = n;
        String BINAARY = "";
        while (num > 0) {
            int remainder = num % 2;
            BINAARY += remainder;
            num /= 2;
        }
        return BINAARY;
    }
}
