import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();
        sc.close();
        double areaOfCircle = Math.PI * radius * radius;
        double perimeterOfCircle = 2 * Math.PI * radius;
        System.out.println(areaOfCircle);
        System.out.println(perimeterOfCircle);
    }
}
