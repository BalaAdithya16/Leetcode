class Solution {
    public static int neg(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int ans=0;
        int count=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<0){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(r<0){
            return -1;
        }
        if(nums[r]==0){
            return -1;
        }
        return r;
    }
    public static int pos(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int ans=0;
        int count=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<=0){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(l>=nums.length){
            return -1;
        }
        if(nums[l]==0){
            return -1;
        }
        return l;
    }
    public int maximumCount(int[] nums) {
        int n=neg(nums);
        int p=pos(nums);
        int ans=0;
        if(n==-1 && p==-1){
            ans=0;
        }
        else if(p==-1){
            ans=n+1;
        }
        else if(n==-1){
            ans=nums.length-p;
        }
        else{
            ans=Math.max(n+1,nums.length-p);
        } 
        return ans;
    }
}
        