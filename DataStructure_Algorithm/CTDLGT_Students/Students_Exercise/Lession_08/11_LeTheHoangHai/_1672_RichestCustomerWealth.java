public class _1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int a = accounts[0].length;
        int b = accounts.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<b; i++) {
            int wealthi =0;
            for (int j = 0; j<a; j++) {
                wealthi += accounts[i][j];
            }
            max = Math.max(max, wealthi);
        }

        return max;
    }
}
