public class SearchForAnElement {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 10;
        boolean answer = findMatrix(arr, target);
        System.out.println(answer);
    }

    private static boolean findMatrix(int[][] arr, int target) {
        int rows = arr.length;
        int columns = arr[0].length - 1;

        int row = 0;
        int col = columns - 1;

        while (row < rows && col >= 0) {
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}

/*
* Explanation
*
* Certainly! The provided code demonstrates a program in Java to search for a target element in a 2D matrix.
* Here's a step-by-step explanation of the code:
1. The `SearchForAnElement` class is defined, containing two methods: `main` and `findMatrix`.

2. In the `main` method, a 2D array `arr` is initialized with values `{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`,
   representing a matrix. The target element to search for is set to `5`.

3. The `findMatrix` method is called, passing the matrix `arr` and the target element `target` as arguments.
   The return value is stored in a boolean variable `answer`.

4. The `findMatrix` method takes the matrix `arr` and the target element `target` as input and returns a boolean value
   indicating whether the target element is found in the matrix.

5. In the `findMatrix` method, the number of rows in the matrix is obtained by `arr.length`, and the number of
   columns is obtained by `arr[0].length - 1`. We subtract 1 from the number of columns to account for zero-based
   indexing.

6. Two variables, `row` and `col`, are initialized to the top-right corner of the matrix. `row` is set to 0
   (representing the first row), and `col` is set to `columns - 1` (representing the last column).

7. A while loop is used to traverse the matrix starting from the top-right corner. The loop continues until we reach
   the bottom-left corner of the matrix or find the target element.

8. Inside the loop, the program checks if the current element at `arr[row][col]` is equal to the target.
   If it is, the target element is found, and the method returns `true`.

9. If the current element is greater than the target, it means we need to move towards the left (decrement the `col`
   value) to find a smaller element. This is because the matrix is sorted in row-wise and column-wise order.

10. If the current element is less than the target, it means we need to move downwards (increment the `row` value)
    to find a larger element.

11. After each iteration, the program checks the next element in the matrix based on the comparison and adjusts
    the `row` and `col` variables accordingly.

12. If the loop finishes without finding the target element, the method returns `false`.
13. In the `main` method, the value of `answer` (indicating whether the target element was found) is printed.

In the given example, the target element `5` is present in the matrix. The program outputs `true` because the target
element is successfully found in the matrix using the approach explained above.

*/
