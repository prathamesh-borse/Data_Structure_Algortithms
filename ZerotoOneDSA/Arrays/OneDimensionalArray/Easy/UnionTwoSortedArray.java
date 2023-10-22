package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6};
        int[] b = {2, 3, 5};
        List<Integer> ans = unionTwoSortedArray(a, b);
        System.out.println(Arrays.asList(ans));
    }

    static List<Integer> unionTwoSortedArray(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(a[i])) {
                    temp.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(b[j])) {
                    temp.add(b[j]);
                }
                j++;
            } else {
                if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(a[i])) {
                    temp.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (j < n2) {
            if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(b[j])) {
                temp.add(b[j]);
            }
            j++;
        }

        while (i < n1) {
            if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(a[i])) {
                temp.add(a[i]);
            }
            i++;
        }
        return temp;
    }
}
