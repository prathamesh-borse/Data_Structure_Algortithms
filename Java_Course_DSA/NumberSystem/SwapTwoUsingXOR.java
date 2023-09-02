package Java_Course_DSA.NumberSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapTwoUsingXOR {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        List<Integer> list = swapTwoNumbers(a, b);
        System.out.println(Arrays.asList(list));
    }

    private static List<Integer> swapTwoNumbers(int a, int b) {
        List<Integer> list = new ArrayList<>();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        list.add(a);
        list.add(b);
        return list;
    }
}
