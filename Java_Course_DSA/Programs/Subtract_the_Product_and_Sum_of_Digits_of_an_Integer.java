package Java_Course_DSA.Programs;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        int num = 234;
        int answer = difference(num);
        System.out.println(answer);
    }

    private static int difference(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            product = product * lastDigit;
            n = n / 10;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        return product - sum;
    }
}
