class Solution {
    public static boolean isposi(int[] nums,int max,int mid){
         for(int i=0;i<nums.length;i++){
            if(nums[i]>mid){
                int temp=nums[i]/mid;
                if(nums[i]%mid==0){
                    max-=temp-1;
                }
                else{
                    max-=temp;
                }
            }
            if(max<0){
               return false;
            }
         }
         return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(nums,maxOperations,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}