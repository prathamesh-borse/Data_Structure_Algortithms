package Java_Course_DSA.Recursion;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = checkPalindrome(s);
        System.out.println(ans);
    }

    private static boolean checkPalindrome(String str) {
        String s1 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("Replacement String: " + s1);
        int n = str.length();
        if (n == 0)
            return true;
        return isPalindrome(s1, 0, s1.length() - 1);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if ((s.charAt(start)) != (s.charAt(end))) return false;
        return isPalindrome(s, start + 1, end - 1);
    }
}
