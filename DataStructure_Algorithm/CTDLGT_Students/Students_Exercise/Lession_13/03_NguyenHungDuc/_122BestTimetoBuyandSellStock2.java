class _122BestTimetoBuyandSellStock2 {

  public static int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      profit += Math.max(0, prices[i] - prices[i - 1]);
    }

    return profit;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 6, 4, 3, 1 };

    System.out.println(maxProfit(prices));
  }
}
