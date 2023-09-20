package ZerotoOneDSA.NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ans = 0;
        int i = 0;

        int num = 0;
        if (n < 0) {
            num = -n;
            while (num != 0) {

                // checking the bit here by doing
                int bit = num & 1;
                // we use this formula to multiply the bit with the increasing power and adding to the earlier ans
                ans = (int) ((bit * Math.pow(10, i)) + ans);
                // right shifting the number by 1 (dividing the number by 2)
                num = num >> 1;
                // increasing the i because the power will be increased
                i++;
            }
            System.out.println("Answer is: " + ans);
        } else {
            // checking till n not equal to zero
            while (n != 0) {

                // checking the bit here by doing
                int bit = n & 1;
                // we use this formula to multiply the bit with the increasing power and adding to the earlier ans
                ans = (int) ((bit * Math.pow(10, i)) + ans);
                // right shifting the number by 1 (dividing the number by 2)
                n = n >> 1;
                // increasing the i because the power will be increased
                i++;
            }
            System.out.println("Answer is: " + ans);
        }
    }
}

/*
 * To find reverse of the number like 321
 * we will use
 * ans = (digit * 10 ^ i (power)) + ans
 *
 * */
