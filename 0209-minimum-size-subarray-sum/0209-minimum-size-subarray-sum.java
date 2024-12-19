class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int ans=Integer.MAX_VALUE;
        int temp=0;
        for(int r=0;r<nums.length;r++){
            temp+=nums[r];
            while(temp>=target){
                ans=Math.min(ans,r-l+1);
                temp-=nums[l];
                l++;
            }
        }
        
    if(ans==Integer.MAX_VALUE){
        ans=0;
    }
        return ans;
    }
}