class Solution {
    public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
       int ans=0;
       int l=1;
       for(int r=0;r<nums.length-1;r++){
           ans+=Math.min(nums[r],nums[l]);
           l+=2;
           r+=1;
       }
       return ans;
    }
}