class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minsellvalue=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            minsellvalue=Math.min(minsellvalue,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minsellvalue);
        }
        return maxProfit;
    }
}