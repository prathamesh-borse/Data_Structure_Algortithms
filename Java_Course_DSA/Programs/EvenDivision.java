package Java_Course_DSA.Programs;

public class EvenDivision {
    public static void main(String[] args) {
        int[] arr = {4, 64, 28, 12, 28};
        int answer = numberOfOperations(arr);
        System.out.println(answer);
    }

    private static int numberOfOperations(int[] arr) {
        int operations = 0;
        boolean allEven = true;

        while (allEven) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    allEven = false;
                    break;
                } else {
                    arr[i] /= 2;
                }
            }

            if (allEven) {
                operations++;
            }
        }
        return operations;
    }
}
