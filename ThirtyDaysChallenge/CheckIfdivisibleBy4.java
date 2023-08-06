package ThirtyDaysChallenge;

public class CheckIfdivisibleBy4 {
    public static void main(String[] args) {
        String n = "1124";
        int answer = divisiblebyfour(n);
        System.out.println(answer);
    }

    private static int divisiblebyfour(String N) {
//        long number = Long.parseLong(n);
//        if (number % 4 == 0) {
//            return 1;
//        }
//        return 0;

        int len = N.length();

        String strnum = "";
        if (len == 0) {
            return 0;
        } else if (len == 1) {
            strnum = N;
        } else {
            strnum = N.substring(len - 2, len);
        }

        int num = Integer.parseInt(strnum);

        return (num % 4 == 0) ? 1 : 0;
    }
}
