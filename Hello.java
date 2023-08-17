import java.util.Arrays;

public class Hello {
//    public static void mergeArray(int arr[],int[] nums1, int[] nums2,int m,int n) {
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < m && j < n) {
//            if (nums1[i] <= nums2[j]) {
//                arr[k++] = nums1[i];
//                i++;
//            } else {
//                arr[k++] = nums2[j];
//                j++;
//            }
//        }
//        while (i < m) {
//            arr[k++] = nums1[i];
//        }
//        while (j < n) {
//            arr[k++] = nums2[j];
//            j++;
//        }
//    }
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int m = nums1.length;
//        int n = nums2.length;
//        int len = m + n;
//        int arr[] = new int[m+n];
//        double ans;
//        mergeArray(arr, nums1, nums2, 2, 2);
//
//        int k = len / 2;
//        if (k % 2 != 0) {
//            return arr[k];
//        }
//        ans = (double)(arr[k] + arr[k - 1]) / 2;
//        return ans;
//    }
        public static void main(String[] args) {
        System.out.println("Hello and Welcome");
//        int nums1[] = {1,2};
//        int nums2[] = {3,4};
//            System.out.println(findMedianSortedArrays(nums1,nums2));
        // int x = 11234;
        // int count = 0;
        // while (x != 0)
        //   {
        // x = x / 10;
        // count++;
        //   }
        //   System.out.println (count);

        // int x = 11254; // 1 + 1 = 2 + 2 = 4 + 5 = 9 + 4 = 13
        // int sum = 0;
        // while(x != 0) {
        //     sum += x;
        // }
        // System.out.print(sum);
//        int x = 1321;
//        int answer = reverseNumber(x);
//
//        int x = 1551;
//        int y = 0;
//        while (x != 0) {
//            x = x % 10;
//            x = x / 10;
//            y = y * 10 + x;
//            System.out.print(y);
//        }

//        int x = -121;
//        int answer = reverseNumber(x);
//        if (x == answer) {
//            System.out.print("Number is Palindrome");
//        } else {
//            System.out.print("Number is not Palindrome");
//        }
//        boolean answer = isPalindrome(x);
//        System.out.println(answer);

//      int x = 1551, y = 0, temp = 0;
//      while (x > 0)
//        {
//          x = x % 10;
//          x = x / 10;
//          temp = temp * 10 + x;
//        }
//      if (temp == y)
//        {
//          System.out.println ("Number is Palindrome");
//        }
//      else
//        {
//          System.out.println ("not Palindrome");
//        }
//    }
//
//    private static int reverseNumber(int x) {
//        int y = 0;
//        while (x != 0) {
//            int digit = x % 10;
//            x = x / 10;
//            y = y * 10 + digit;
//        }
//        System.out.println(y);
//        return y;
//    }
//
//    public static boolean isPalindrome(int x) {
//        int answer = 0;
//        int temp = x;
//        if (temp < 0) {
//            return false;
//        }
//        while (x != 0) {
//            int lastdigit = x % 10;
//            x = x / 10;
//            answer = answer * 10 + lastdigit;
//        }
//        System.out.println(temp);
//        System.out.println(answer);
//        if (temp == answer) {
//            return true;
//        } else {
//            return false;
//        }
//    }
      int arr[]={2,5,1,3,4,7};
      int n=3;
      int x = arr.length;
      int ans[]=new int[x];
      solve(arr,n,ans);
      System.out.println(Arrays.toString(ans));
    }

    public static void solve(int arr[],int n,int ans[]){
            int i=0;
            int j=n;
            int k=0;

            while(i<=n && j<arr.length){
                ans[k++]=arr[i];
                i++;
                ans[k++]=arr[j];
                j++;
            }
    }
}

