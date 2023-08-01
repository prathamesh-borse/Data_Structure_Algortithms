package All_Basic_Java_Programs;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /* Take the day no and print the corresponding day 
         * for 1 print -> monday
         * for 2 print -> Tuesday
         * and so on for 7 day
         */

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Condition");
                break;
        }
    }
}
