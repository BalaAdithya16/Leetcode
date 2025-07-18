class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int l=0;
        int r=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[l]=nums[i];
                l+=2;
            }
            else{
                ans[r]=nums[i];
                r+=2;
            }
        }
        return ans;
    }
}