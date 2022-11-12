class Solution {
    public int maxProfit(int[] prices) {
     int minsofor=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            minsofor=Math.min(minsofor,prices[i]);
            profit=Math.max(profit,prices[i]-minsofor);
        }
        return profit;
    }
        }