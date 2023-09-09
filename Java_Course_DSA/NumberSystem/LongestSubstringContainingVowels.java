package Java_Course_DSA.NumberSystem;

import java.util.Arrays;

public class LongestSubstringContainingVowels {
    public static void main(String[] args) {
        String s = "eleetminicoworoep";
        int ans = findLargestSubstring(s);
        System.out.println(ans);
    }

    private static int findLargestSubstring(String s) {
        int n = s.length();
        int[] state = new int[32]; // Store the state of vowels ('a', 'e', 'i', 'o', 'u')
        Arrays.fill(state, -2);
        state[0] = -1;
        int maxLength = 0;
        int currentState = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a') currentState ^= 1; // Toggle the first bit
            else if (c == 'e') currentState ^= 2; // Toggle the second bit
            else if (c == 'i') currentState ^= 4; // Toggle the third bit
            else if (c == 'o') currentState ^= 8; // Toggle the fourth bit
            else if (c == 'u') currentState ^= 16; // Toggle the fifth bit

            // If the current state was seen before, update maxLength
            if (state[currentState] != -2) {
                maxLength = Math.max(maxLength, i - state[currentState]);
            } else {
                // If the current state is new, save it with the current index
                state[currentState] = i;
            }
        }

        return maxLength;
    }
}
