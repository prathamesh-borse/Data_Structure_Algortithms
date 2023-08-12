package Java_Course_DSA;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        int num = 14;
        int answer = numberOfSteps(num);
        System.out.println(answer);
    }

    private static int numberOfSteps(int num) {
        int count = 0, temp = num;
        while (temp != 0)
            if (temp % 2 == 0) {
                temp = temp / 2;
                count = count + 1;
            } else if (temp % 2 != 0) {
                temp -= 1;
                count = count + 1;
            }
//        System.out.println("count: " + count);
//        System.out.println("temp: " + temp);
        return count;
    }
}