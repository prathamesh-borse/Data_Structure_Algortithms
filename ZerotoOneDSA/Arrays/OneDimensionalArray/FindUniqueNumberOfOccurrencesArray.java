package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindUniqueNumberOfOccurrencesArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        printArray(arr, 6);

        boolean ans = findUniqueNUmberOfOccrences(arr, 6);
        System.out.println(ans);
    }

    static boolean findUniqueNUmberOfOccrences(int[] arr, int size) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        // ek for loop jo ki 1 pasun start hoil
        // another for loop jo ki i + 1 pasun start
        while (i < size) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else {
                    break;
                }
            }
            ans.add(count);
            i = i + count;
        }
        int ListSize = ans.size();
        Collections.sort(ans);
        for (int j = 0; j < ListSize - 1; j++) {
            if (ans.get(j) == ans.get(j + 1)) {
                return false;
            }
        }
        return true;
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
