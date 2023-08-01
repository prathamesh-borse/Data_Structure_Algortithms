package GFG_Problems;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MyCalender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        sc.close();
        System.out.println(findDay(year, month,day));
    }

    public static String findDay(int year, int month, int day){
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        SimpleDateFormat smd = new SimpleDateFormat("EEEE");
        return smd.format(c.getTime()).toUpperCase();  
    }
}
