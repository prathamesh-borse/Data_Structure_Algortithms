package Java_Course_DSA.Programs;

public class SumDiagonalElements {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int answer = findDiagonal(arr);
        System.out.println(answer);
    }

    private static int findDiagonal(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            // here we are getting arr[i][i] because it is pointing the same index of array row and column
        }
        return sum;

    }
}
