class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int mProfit = 0;
        for(int i=0;i<prices.length;i++)
        {
            mProfit=Math.max(mProfit,prices[i]-minPrice);
            minPrice=Math.min(minPrice,prices[i]);
        }
        return mProfit;
    }
}