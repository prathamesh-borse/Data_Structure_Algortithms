package All_Basic_Java_Programs;

public class Pass_By_Value {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
        doSomething(number);
        System.out.println(number);
    }

    static void doSomething(int number) {
        number += 5;
        System.out.println(number);
        number += 5;
        System.out.println(number);
    }
}
