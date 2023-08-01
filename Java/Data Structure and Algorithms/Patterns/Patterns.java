package Patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            pattern22(n);
        }
        scan.close();
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    // Star increasing pattern
    static void pattern10(int n) {

        // Solving approach by striver
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }

    // Pattern11 = Solving Approach 2 by striver
    static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // if (i % 2 == 0) {
        // if (j % 2 == 0) {
        // System.out.print("1" + " ");
        // } else {
        // System.out.print("0" + " ");
        // }

        // } else {
        // if (j % 2 == 0) {
        // System.out.print("0" + " ");
        // } else {
        // System.out.print("1" + " ");
        // }

        // }

        // }
    }

    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");

        // }
        // for (int s = (n - i) * 2; s >= 1; s--) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");

        // }
        // System.out.println();
        // }

        // Solving approach by striver
        // int space = 2 * (n - 1);
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);

        // }
        // for (int s = 1; s <= space; s++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);

        // }
        // System.out.println();
        // space -= 2;
        // }
    }

    static void pattern13(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
                // System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        int character = 65;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (character + j) + " ");
            }
            System.out.println();
        }

        // // Solving approach by striver
        // for (int i = 0; i < n; i++) {
        // for (char j = 'A'; j <= 'A' + i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Solving approach by striver
        // for (int i = 0; i < n; i++) {
        // for (char j = 'A'; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
    }

    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        // int character = 65;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print((char) (character + i) + " ");
        // // character = character + 1;
        // }
        // System.out.println();
        // }

        // Solving approach by striver
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int breakpoint = (2 * i + 1) / 2;
            char alphabet = 'A';
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(alphabet);
                if (j <= breakpoint) {
                    alphabet++;
                } else {
                    alphabet--;
                }
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char alphabet = (char) (n + 64);
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet-- + " ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n) {
        int inspace = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + "");
            }

            for (int k = 0; k < inspace; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + "");
            }
            inspace += 2;
            System.out.println();
        }

        inspace = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }

            for (int k = 0; k < inspace; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            inspace -= 2;
            System.out.println();
        }
    }

    static void pattern20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "");
            }

            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "");
            }

            System.out.println();
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }

    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}