package ZerotoOneDSA.NumberSystem;

import java.util.Map;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 0;
        int ans = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 1) {
                ans = (int) (ans + Math.pow(2, i));
            }
            n = n / 10;
            i++;
        }
        System.out.println("Answer is: " + ans);
    }
}

/*
 * koi bhi binary number 2 ki power mai represent kr skta hu
 * decimal to binary = we do it using dividing it by 2
 * binary to decimal = we do it using multiplying it by 2
 *
 * bit nikalenge to right shift marenge
 * digit nikalenge to divide marenge
 * */