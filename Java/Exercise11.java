import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int number3 = sc.nextInt();
        sc.close();

        double result = (number1 + number2 + number3) / 3;
        System.out.println("average of three numbers are: "  + result);
    }
}
