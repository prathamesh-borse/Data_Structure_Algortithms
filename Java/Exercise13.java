import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the Height: ");
        double height = sc.nextDouble();
        sc.close();

        double areaOfReactangle = width * height;
        double perimeterOfReactangle = 2 * (width + height);
        System.out.println("area is: "  + areaOfReactangle);
        System.out.println("perimeter is: "  + perimeterOfReactangle);
        
    }
}
