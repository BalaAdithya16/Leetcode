class Solution {
    public int leftmost(int[] nums){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>0){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l>=nums.length){
            return 0;
        }
        if(nums[l]==0){
            return 0;
        }
        return nums.length-l;
    }
    public int rightmost(int[] nums){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=0){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(r<0){
            return 0;
        }
        if(nums[r]==0){
            return 0;
        }
        return r+1;
    }
    public int maximumCount(int[] nums) {
        int pos=leftmost(nums);
        int neg=rightmost(nums);
        return Math.max(pos,neg);
    }
}