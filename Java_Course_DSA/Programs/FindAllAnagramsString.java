package Java_Course_DSA.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = findAllAnagrams(s, p);
        System.out.println(Arrays.asList(ans));
    }

    private static boolean compare(HashMap<Character, Integer> smap, HashMap<Character, Integer> pmap) {
        for (char sch : smap.keySet()) {
            if (pmap.getOrDefault(sch, 0) != smap.get(sch)) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> findAllAnagrams(String s, String p) {
        HashMap<Character, Integer> pmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
        }

        int i = p.length();
        List<Integer> ans = new ArrayList<>();

        while (i < s.length()) {
            if (compare(pmap, smap) == true) {
                ans.add(i - p.length());
            }

            char cha = s.charAt(i);
            smap.put(cha, smap.getOrDefault(cha, 0) + 1);

            char chr = s.charAt(i - p.length());
            if (smap.get(chr) == 1) {
                smap.remove(chr);
            } else {
                smap.put(chr, smap.get(chr) - 1);
            }
            i++;
        }

        if (compare(pmap, smap) == true) {
            ans.add(i - p.length());
        }

        return ans;
    }
}
