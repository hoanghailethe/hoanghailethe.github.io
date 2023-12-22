package anhdv.graph;

/**
 *
 * @author anhdv
 */
public class _122_BestTimeToBuyAndSellStockII {
    
    static int maxProfit(int[] prices) {
        
        int result = 0;
		
        for (int i = prices.length - 2; i >= 0; i--){
            if (prices[i+1] > prices[i])
                result += prices[i+1] - prices[i];
        }

        return result;
    }
    
    public static void main(String[] args) {
        
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        
        System.out.println("result: " + maxProfit(nums));
    }
}
