class Solution {
    public boolean isposi(int[] nums, int maxOperations,int n){
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int a=nums[i]/n;
            maxOperations-=a;
            if(nums[i]%n==0){
                maxOperations++;
            }
        }
        if(maxOperations>=0){
            return true;
        }
        return false;
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