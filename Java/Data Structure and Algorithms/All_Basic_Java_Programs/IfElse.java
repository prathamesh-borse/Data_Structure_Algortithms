package All_Basic_Java_Programs;

import java.util.Scanner;

// Write a program which takes age and prints you are adult or not.

// If you are having an if statement, then it is not mandatory to have an else statement
// public class IfElse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age:");
//         int age = sc.nextInt();

//         if(age >= 18) {
//             System.out.println("You are adult.");
//         }else {
//             System.out.println("You are not an adult.");
//         }
//     }
// }


/* 
A school has following rules for grading system
a. Below 25 - F
b. 25 to 44 - E
c. 45 to 49 - D
d. 50 to 59 - C
e. 60 to 79 - B
f. 80 to 100 - A

Ask user to enter marks and print the corresponding grades.
*/

// public class IfElse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your marks:");
//         int marks = sc.nextInt();
//         /* here else if will come into picture because it saves time at the time of execution 
//         it will not execute all if statement if one is executed.  */

//         if(marks < 25) {
//             System.out.println("F");
//         }
//         // If you have multiple use the &&
//         else if(marks <= 44) {
//             System.out.println("E");
//         }

//         else if(marks <= 49) {
//             System.out.println("D");
//         }

//         else if(marks <= 59) {
//             System.out.println("C");
//         }

//         else if(marks <= 79) {
//             System.out.println("B");
//         }

//         else if(marks <= 100) {
//             System.out.println("A");
//         }
//     }
// }


/* Program
Take the age from user and decide accordingly
1. If age < 18,
    print-> "not eligible for job"
2. If age >= 18
    print-> "eligible for job"
3. If age>=55 and age<= 57
    print-> "eligible for job, but retirement soon."
4. If age > 57
    print-> "retirement time"
*/

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        /* here else if will come into picture because it saves time at the time of execution 
        it will not execute all if statement if one is executed.  */

        if(age < 18) {
            System.out.println("Not eligible for job");
        }
        // If you have multiple use the &&
        else if(age <= 54) {
            System.out.println("eligible for job");
        }

        else if(age <= 57) {
            System.out.println("eligible for job, but retirement soon.");
        }

        else {
            System.out.println("retirement time.");
        }
    }
}