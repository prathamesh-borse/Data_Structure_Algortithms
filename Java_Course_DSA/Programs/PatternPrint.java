package Java_Course_DSA.Programs;

public class PatternPrint {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("^");
            }
            System.out.println("*");
        }
    }
}
