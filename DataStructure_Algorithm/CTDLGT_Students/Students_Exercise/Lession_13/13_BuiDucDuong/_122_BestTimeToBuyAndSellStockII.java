package day10;

public class _122_BestTimeToBuyAndSellStockII {
    /**
     * 1 ms
     * 
     * 38.3 MB
     * 
     * 64.71%
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int j = i;
            while (j < prices.length - 1 && prices[j] < prices[j + 1]) {
                j++;
            }
            max += prices[j] - prices[i];
            i = j;
        }
        return max;
    }
}
