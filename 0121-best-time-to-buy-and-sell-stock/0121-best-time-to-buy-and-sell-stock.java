class Solution {
    public int maxProfit(int[] prices) {
      int p=0;
      int m=prices[0];
        for(int i=1;i<prices.length;i++){
            m=Math.min(prices[i],m);
            p=Math.max(p,prices[i]-m);
        }
        return p;
        
    }
}  