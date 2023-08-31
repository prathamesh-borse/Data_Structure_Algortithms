package Java_Course_DSA.BinarySearch;


/*
 * You have given h hours to finish all the bananas because the guards have gone.
 *
 * */

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int eatingSpeed = minEatingSpeed(piles, h);
        System.out.println(eatingSpeed);
    }

    private static int hours(int speed, int[] piles) {
        int required_hours = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            required_hours += piles[i] / speed;
            if (piles[i] % speed != 0) required_hours++;
        }
        return required_hours;
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int min_speed = 0, max_speed = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max_speed) max_speed = piles[i];
        }

        int s = min_speed, e = max_speed, ans = 0;
        while (s <= e) {
            int mid = (s + e) / 2;
            int required_hours = hours(mid, piles);
            if (required_hours > h) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }
}
