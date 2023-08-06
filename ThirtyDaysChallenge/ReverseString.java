package ThirtyDaysChallenge;

// GFG = Reverse a String

public class ReverseString {
    public static void main(String[] args) {
        String s = "Geeks";
        String newStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newStr += s.charAt(i);
        }
        System.out.println(newStr);
    }
}
