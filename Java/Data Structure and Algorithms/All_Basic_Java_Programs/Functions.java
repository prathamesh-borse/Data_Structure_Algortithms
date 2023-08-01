package All_Basic_Java_Programs;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Take the input and print the name using function
        // Take two number and prints its sum
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();
        // printName(name);
        System.out.println("The addition of both numbers is: " + printAddition(number1, number2));
    }

    // static void printName(String name) {
    //     System.out.println("My " + name + " is this.");
    // }

    static int printAddition(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        return result;
    }
}
