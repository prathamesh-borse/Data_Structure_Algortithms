package GFG_Problems;

import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(datatypesize(s));
    }

    static int datatypesize(String str) {
        switch (str) {
            case "Character":
                return 1;
            case "Integer":
                return Integer.BYTES;
            case "Float":
                return Float.BYTES;
            case "Double":
                return Double.BYTES;
            case "Long":
                return Long.BYTES;
        }
        return -1;

    }

}
