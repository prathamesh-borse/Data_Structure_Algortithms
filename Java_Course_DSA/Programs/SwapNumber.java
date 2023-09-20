package Java_Course_DSA.Programs;

import java.util.ArrayList;
import java.util.List;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 100, b = 50;
        List<Integer> answer = swapNumbers(a, b);
        System.out.println(answer.toString());
    }

    private static List<Integer> swapNumbers(int a, int b) {
        List<Integer> list = new ArrayList<Integer>();
        int temp = a;
        a = b;
        b = temp;

        list.add(a);
        list.add(b);
        return list;
    }
}
