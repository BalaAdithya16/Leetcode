class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int low=nums[0];
        for(int i=1;i<nums.length;i++){
             if(low<nums[i]){
                int temp=nums[i]-low;
                 max=Math.max(max,temp);
                 
             }
             low=Math.min(low,nums[i]);
           }
         return max;
    }
}