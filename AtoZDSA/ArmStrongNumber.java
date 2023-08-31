package AtoZDSA;

/*
 * Armstrong number
 * means taking cubes of individual digits and then adding them up makes to that number it is armstrong number.
 * */

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 1634;
        boolean ans = isarmstrongNumber(n);
        System.out.println(ans);
    }

    private static boolean isarmstrongNumber(int n) {
        int num = n, result = n, armstrongNumber = 0, len = 0, cube;
        while (n > 0) {
            int lastdigit = n % 10;
            len++;
            n /= 10;
        }
        System.out.println("Length: " + len);

        while (num > 0) {
            int lastdigit = num % 10;
            cube = (int) Math.pow(lastdigit, len);
            armstrongNumber = armstrongNumber + cube;
            num /= 10;
        }

        return result == armstrongNumber;
    }
}
