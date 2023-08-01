package GFG_Problems;

import java.util.*;
import java.math.*;

public class BigIntegerClass {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        sc.close();
        BigInteger sum = A.add(B);
        System.out.println(sum);
        BigInteger multiply = A.multiply(B);
        System.out.println(multiply);
        
    }
}