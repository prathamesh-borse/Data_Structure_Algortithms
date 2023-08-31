package AtoZDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> ans = printDivisors(n);
        System.out.println(Arrays.asList(ans));
    }

    private static List<Integer> printDivisors(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static List<Integer> printDivisors1(int n) {
        List<Integer> ans = new ArrayList<>();

        // Traversing from 1 to sqrt(N).
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
                if (n / i != i) {
                    ans.add(n / i);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}