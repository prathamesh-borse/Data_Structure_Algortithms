package Java_Course_DSA.Programs;

public class SmallestThreeNumbers {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int answer = min(a,b,c);
        System.out.println(answer);
    }

    private static int min(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        } else if ((b < a) && (b < c)) {
            return b;
        }
        return c;
    }
}
