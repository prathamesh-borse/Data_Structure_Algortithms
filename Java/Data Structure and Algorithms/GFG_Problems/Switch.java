package GFG_Problems;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter radius");
                int r = sc.nextInt();
                System.out.println("Area of circle is: " + Math.PI*r*r);
                break;
            case 2:
                System.out.println("Enter length:");
                int l = sc.nextInt();
                System.out.println("Enter bredth: ");
                int b = sc.nextInt();
                System.out.println("Area of reactangle is: " + l*b);
                break;

            default:
                System.out.println("Invalid Condition");
                break;
        }
        sc.close();
    }
}
