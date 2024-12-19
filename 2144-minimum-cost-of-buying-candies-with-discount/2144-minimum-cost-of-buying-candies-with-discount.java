class Solution {
    public int minimumCost(int[] cost) {
       Arrays.sort(cost);
       int l=cost.length-3;
       int ans=0;
       for(int r=cost.length-1;r>=0;r--){
           if(l-r==0){
               l-=3;
           }
           else{
               ans+=cost[r];
           }
       }
       return ans;
    }
    
}