public class _122_BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        if(prices == null) return 0;

        int previous = -1; //previous hold the price of previous day - the day before today.
        int buyPrice = -1;
        int sellPrice = 0;
        int profit = 0;

        for (int todayPrice : prices) {
            //the first value of previous must not biggest (bug)
            if(buyPrice == -1 && todayPrice < previous) {
                previous = todayPrice;
            }

            //the previous holding the value of previous day
            //if not holding stock sell != -1
            if (todayPrice > previous && buyPrice == -1) {
                //check the day after (todayPrice > or not) then decide to buy pre day
                buyPrice = previous;
                previous = todayPrice;
            }

            //now the Selling part => profit
            if (todayPrice <= previous && buyPrice != -1) {
                sellPrice = previous;
                profit += sellPrice - buyPrice;
                buyPrice = -1;
            }       
        }
        return profit;
    }

    public static void main(String[] args) {
        int [] prices = {1,2,3,4,5};
        //int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
