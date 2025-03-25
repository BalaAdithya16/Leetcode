class Solution {
    public static boolean isposi(int[] nums,int k,int mid){
        int count=0;
        k-=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mid){
                return false;
            }
            if(count+nums[i]>mid){
                k-=1;
                count=0;
            }
            count+=nums[i];
    if(k<0){
        return false;
    }
    }
    return true;
    }
    public static int splitArray(int[] nums, int k) {
        int l=0;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(nums,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
       }
       return l;
    }
}