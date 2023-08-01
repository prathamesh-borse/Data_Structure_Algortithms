package GFG_Problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int flag = 0;
        if(number == 1 || number == 0) {
            flag = 1;
        }
        for(int i=2;i<=Math.sqrt(number);i++) {
            if(number % i == 0) {
                flag = 1;
            }
        }

        if(flag == 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    }
}
