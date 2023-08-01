package GFG_Problems;

import java.util.Scanner;

/*
Hackerrank = Java Stdin and Stdout II Question
Because the Scanner object will read the rest of the line where its previous read left off.
If there is nothing on the line, it simply consumes the newline and moves to the starting of the next line.
After double declaration, you have to write: scan.nextLine();
 */

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
