package Java_Course_DSA.NumberSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        int n = 3;
        List<Integer> list = grayCode(n);
        System.out.println(Arrays.asList(list));
    }

    public static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);

        for (int i = 0; i < n; i++) {
            int size = ans.size();
            // we will iterate over all the number in the reverse order
            for (int j = size - 1; j >= 0; j--) {
                int currentNumber = ans.get(j);
                // eg. 4 | (1 << 1) = 1 is 001 it will shift by 1 = 001 -> 010 and 100 | 010 = 110 = 6
                int newNumber = currentNumber | (1 << i);
                ans.add(newNumber);
            }
        }
        return ans;
    }
}
