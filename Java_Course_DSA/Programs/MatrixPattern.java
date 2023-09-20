package Java_Course_DSA.Programs;

public class MatrixPattern {
    public static void main(String[] args) {
        int m = 3, n = 3;
        rectangle(m, n);
    }

    private static void rectangle(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1 && j == 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}