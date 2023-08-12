package Java_Course_DSA;

public class Sum_Multiples {
    public static void main(String[] args) {
        int n = 10;
        int answer = sumOfMultiples1(n);
//        sumOfMultiples1(n);
        System.out.println(answer);
    }

    // Brute Force
    private static int sumOfMultiples1(int n) {
        int i, sum = 0;
        for (i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Approach 2: Optimise Approach
    public int calculate(int n, int k) {
        return k * (n / k) * (n / k + 1) / 2;
    }

    public int sumOfMultiples(int n) {
        return calculate(n, 3) + calculate(n, 5) + calculate(n, 7)
                - calculate(n, 3 * 5) - calculate(n, 5 * 7) - calculate(n, 3 * 7)
                + calculate(n, 3 * 5 * 7);
    }
}
/*
* Approach 2: Optimise Approach.
* Intuition Algorithm
* To get sum of all factors on k unto n, we can have this formula (sum of Arithmetic progression):
* k∗(n/k)∗(n/k+1)/2 If you wonder how we get above formula then check this out :
* k+2k+3k+4k+.....xk=k(1+2+3+4...x)=k((x)(x+1)/2) where x is the
* largest value of (xk<=n)=>(x<=n/k)
* Above formula is implemented on calculate function.
* To get the ans, we can sum : sum all the factor of 3 + sum of all the factors of 5 + sum of all the factors of 7 - sum of all the factor of 3 * 5 - sum of all the factors of 5 * 7 - sum of all the factors of 3 * 7 + sum of all the factors of 3 * 5 * 7.
*
*
class Solution {
    public int calculate(int n, int k) {
        return k * (n / k) * (n / k + 1) / 2;
    }

    public int sumOfMultiples(int n) {
        return calculate(n, 3) + calculate(n, 5) + calculate(n, 7)
                - calculate(n, 3 * 5) - calculate(n, 5 * 7) - calculate(n, 3 * 7)
                + calculate(n, 3 * 5 * 7);
    }
}

* */

