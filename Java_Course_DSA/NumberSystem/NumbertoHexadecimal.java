package Java_Course_DSA.NumberSystem;

public class NumbertoHexadecimal {
    public static void main(String[] args) {
        int num = -1;
        String ans = toHex(num);
        System.out.println(ans);
    }

    private static String toHex(int n) {
        String decToHex = "0123456789abcdef";
        if (n == 0)
            return "0";
        int num = n;
        String ans = "";
        while (num != 0) {
            ans = decToHex.charAt(num & 15) + ans;
            num = num >>> 4;
        }
        return ans;
    }
}
