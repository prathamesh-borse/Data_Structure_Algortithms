package Java_Course_DSA.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 2};
        int[] bobSizes = {2, 3};
        int[] ans = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(ans));
    }

    private static boolean binary_search(int[] bobSizes, int target) {
        int st = 0;
        int end = bobSizes.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (bobSizes[mid] == target) {
                return true;
            } else if (bobSizes[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return false;
    }

    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0, totalSum = 0, required_Sum = 0;
        ArrayList<Integer> finalAnswer = new ArrayList<>();


        for (int i = 0; i < aliceSizes.length; i++) {
            sumAlice += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            sumBob += bobSizes[i];
        }

        totalSum = sumAlice + sumBob;
        required_Sum = totalSum / 2;
        Arrays.sort(bobSizes);

        for (int i = 0; i < aliceSizes.length; i++) {
            int currentSum = sumAlice - aliceSizes[i];
            int value = required_Sum - currentSum;
            if (binary_search(bobSizes, value)) {
                System.out.println("aliceSizes: " + aliceSizes[i]);
                finalAnswer.add(aliceSizes[i]);
                System.out.println("value: " + value);
                finalAnswer.add(value);
                break; // only one solution is sufficient so we break
            }
        }

        System.out.println(Arrays.asList(finalAnswer));
        // we have initialized array here because the list has got the expected for the candy swap after the list has been filled
        // with the answer we initialized the array
        // earlier this array would always be initialized if we initialize it after the list declaration.
        int[] newArray = new int[finalAnswer.size()];
        for (int i = 0; i < finalAnswer.size(); i++) {
            newArray[i] = finalAnswer.get(i);
        }

        return newArray;
    }
}
