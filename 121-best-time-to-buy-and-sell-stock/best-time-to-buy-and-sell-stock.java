class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxP=0;
        for(int i=1;i<prices.length;i++)
        {
            int profit=(prices[i]-minPrice);
            maxP=Math.max(maxP,profit);
            minPrice=Math.min(minPrice,prices[i]);
        }
        return maxP;
        
    }
}