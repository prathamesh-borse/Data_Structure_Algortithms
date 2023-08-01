import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Input First Number: " + number1);        
        int number2 = sc.nextInt();
        System.out.println("Input Second Number: " + number2);
        sc.close();
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
        System.out.println(number1 + " * " + number2 + " = " + number1*number2);
        System.out.println(number1 + " / " + number2 + " = " + number1/number2);
    
    }
}
