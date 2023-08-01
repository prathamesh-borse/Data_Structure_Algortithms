public class SaraPattern {
    public static void main(String[] args) {
        int N = 3;
        pattern(N);
    }

    private static void pattern(int N) {
        int initialCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(initialCount + " ");
                initialCount += 4;
            }
            System.out.println();
        }
    }
}
