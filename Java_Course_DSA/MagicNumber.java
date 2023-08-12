package Java_Course_DSA;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 125;
        boolean answer = findMagicNumber(n);
        System.out.println(answer);
    }

    private static boolean findMagicNumber(int n) {
        if (n == 0)
            return false;
        else if (n == 1)
            return true;
        else if (n % 5 == 0 && findMagicNumber(n / 5))
            return true;
        return false;
    }
}
