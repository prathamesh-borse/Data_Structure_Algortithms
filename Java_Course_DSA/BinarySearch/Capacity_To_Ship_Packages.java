package Java_Course_DSA.BinarySearch;

public class Capacity_To_Ship_Packages {
    public static void main(String[] args) {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;
        int RequiredDays = shipwithindays(weights, days);
        System.out.println(RequiredDays);
    }

    private static int days(int cap, int[] weights) {
        int required_days = 1;
        int ship_weight = 0;
        int n = weights.length;

        for (int i = 0; i < n; i++) {
            if (ship_weight + weights[i] <= cap) {
                ship_weight += weights[i];
            } else {
                required_days++;
                ship_weight = weights[i];
            }
        }
        return required_days;
    }

    private static int shipwithindays(int[] weights, int given_days) {
        int min_cap = Integer.MIN_VALUE, max_cap = 0;
        int n = weights.length;

        for (int i = 0; i < n; i++) {
            if (weights[i] > min_cap) {
                min_cap = weights[i];
            }
            max_cap += weights[i];
        }

        int s = min_cap, e = max_cap;
        int ans = 0;
        while (s <= e) {
            int m = (s + e) / 2;
            int required_days = days(m, weights);
            if (required_days > given_days) {
                s = m + 1;
            } else {
                ans = m;
                e = m - 1;
            }
        }
        return ans;
    }
}
