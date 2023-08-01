package All_Basic_Java_Programs;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        int[][] arr = new int[3][5];
        arr[0][1] = 30;
        System.out.println(arr[0][1]);

        /* 3 rows and 5 columns
        [0][0], [0][1], [0][2], [0][3], [0][4]
        [1][0], [1][1], [1][2], [1][3], [1][4]
        [2][0], [2][1], [2][2], [2][3], [2][4]
        [3][0], [3][1], [3][2], [3][3], [3][4]
        */
    }
}
