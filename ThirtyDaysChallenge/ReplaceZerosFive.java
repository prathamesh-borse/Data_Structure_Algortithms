package ThirtyDaysChallenge;

public class ReplaceZerosFive {
    public static void main(String[] args) {
        int num = 1004;
        int answer = convertFive(num);
        System.out.println(answer);
    }

    private static int convertFive(int num) {
        return Integer.parseInt(Integer.toString(num).replace("0", "5"));
    }
}
