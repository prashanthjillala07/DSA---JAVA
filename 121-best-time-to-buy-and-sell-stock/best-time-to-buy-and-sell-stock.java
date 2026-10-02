class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int mProfit = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++)
        {
            profit = prices[i]-minPrice;
            mProfit=Math.max(mProfit,profit);
            minPrice=Math.min(minPrice,prices[i]);
        }
        return mProfit;
    }
}