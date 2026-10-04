class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for (int sell : prices) {
            profit = Math.max(profit, sell - minPrice);
            minPrice = Math.min(minPrice, sell);
        }
        return profit;
    }
}
