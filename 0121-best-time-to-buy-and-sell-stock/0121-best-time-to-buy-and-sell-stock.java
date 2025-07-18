class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int l=0;
        for(int r=0;r<prices.length;r++){
            int sum=prices[r]-prices[l];
            max=Math.max(sum,max);
            if(sum<0){
                l=r;
            }
        }
        return max;
     }
}