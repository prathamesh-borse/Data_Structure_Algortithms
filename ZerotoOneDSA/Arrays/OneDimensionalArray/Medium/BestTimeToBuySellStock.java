package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int n = arr.length;
        int ans = maxProfit1(arr, n);
        System.out.println(ans);
    }

    static int maxProfit(int[] prices, int n) {
        int buyValue = prices[0];
        int currentProfit = 0;
        int maxProfit1 = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyValue) {
                currentProfit = prices[i] - buyValue;
                maxProfit1 = Math.max(maxProfit1, currentProfit);
            } else {
                buyValue = prices[i];
            }
        }
        return maxProfit1;
    }

    static int maxProfit1(int[] prices, int n) {
        int mini = prices[0], profit = 0;
        for (int i = 1; i < n; i++) {
            int cost = prices[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return profit;
    }
}
