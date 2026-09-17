class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int k = i; k < prices.length; k++) {
                res = Math.min(res, prices[i] - prices[k]);
            }
        }

        return Math.abs(res);
    }
}
