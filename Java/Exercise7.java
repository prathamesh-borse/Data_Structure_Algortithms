import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " +  i + " = " + number * i);
        }

    }
}
