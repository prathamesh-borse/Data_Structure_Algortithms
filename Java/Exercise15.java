public class Exercise15 {
    public static void main(String[] args) {
        int number = 10;
        int number2 = 20;

        System.out.println("Numbers before swapping: ");
        System.out.println(number);
        System.out.println(number2);

        int temp = number;
        number = number2;
        number2 = temp;
        System.out.println("Number after swapping: ");
        System.out.println(number);
        System.out.println(number2);
    }
}
