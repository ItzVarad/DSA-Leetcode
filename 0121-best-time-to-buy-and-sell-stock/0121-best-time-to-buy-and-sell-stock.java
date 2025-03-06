class Solution {
    public int maxProfit(int[] prices) {
        int minP = prices[0];
        int maxP = 0;
        for(int i=1;i<prices.length;i++){
            int profit = prices[i] - minP;
            maxP = Math.max(profit,maxP);
            minP = Math.min(minP,prices[i]);
        }
        return maxP;
    }
}