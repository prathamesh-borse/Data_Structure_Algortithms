package Java_Course_DSA.Programs;

import java.util.Scanner;

public class leap_Year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean ans = leapYear(year);
        System.out.println(ans);
    }

    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}

/*
 * Basic condition of leap year is:
 * the year should be divisible by 400 and 4
 * and if the year is only divisible by 100 it is not leap year
 * */
