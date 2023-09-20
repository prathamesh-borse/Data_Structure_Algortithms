package Java_Course_DSA.Programs;

//Remember one rule :- You can only buy one time & sell one time

public class BuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int Profit = maxProfit(prices);
        System.out.println(Profit);
    }

    private static int maxProfit(int[] prices) {
        int buyValue = prices[0];
        int currentProfit = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyValue) {
                currentProfit = prices[i] - buyValue;
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                buyValue = prices[i];
            }
        }
        return maxProfit;
    }
}
