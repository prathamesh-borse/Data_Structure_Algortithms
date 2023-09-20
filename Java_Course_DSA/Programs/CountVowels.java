package Java_Course_DSA.Programs;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int answer = countVowels(s);
        System.out.println(answer);
    }

    private static int countVowels(String s) {
        int count = 0;
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
