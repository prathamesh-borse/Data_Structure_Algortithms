package ThirtyDaysChallenge;

public class ReplaceZerosFive {
    public static void main(String[] args) {
        int num = 1004;
        int answer = convertFive(num);
        System.out.println(answer);
    }

    private static int convertFive(int num) {
        int ans = 0;
        int p = 1;
        while (num != 0) {
            int remainder = num % 10;
            if (remainder == 0)
                remainder = 5;
            num = num / 10;
            ans += remainder * p;
            p = p * 10;
        }
        return ans;
//        return Integer.parseInt(Integer.toString(num).replace("0", "5"));
    }
}
