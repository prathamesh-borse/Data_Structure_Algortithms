package Java_Course_DSA.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generate_Parentheses {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = generateParenthses(n);
        System.out.println(Arrays.asList(ans));
    }

    static List<String> finalAnswer = new ArrayList<>();
    static List<Character> currentCombination = new ArrayList<>();

    public static void recur(int index, int n, int sum) {
        if (index == n) {
            if (sum == 0) {
                // add currentParentheses in finalAnswer
                String currentString = "";
                for (int i = 0; i < currentCombination.size(); i++) {
                    currentString = currentString + currentCombination.get(i);
                }

                finalAnswer.add(currentString);
            }
            return;
        }

        if (sum + 1 <= (n / 2)) {
            currentCombination.add('(');
            recur(index + 1, n, sum + 1);
            currentCombination.remove(currentCombination.size() - 1);
        }


        if (sum > 0) {
            // then only you can choose closing bracket
            currentCombination.add(')');
            recur(index + 1, n, sum - 1);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }


    private static List<String> generateParenthses(int n) {
        currentCombination = new ArrayList<Character>();
        finalAnswer = new ArrayList<String>();

        recur(0, 2 * n, 0);

        return finalAnswer;

    }
}
