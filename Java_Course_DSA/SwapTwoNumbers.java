public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        swap(a,b);
    }

    private static void  swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
