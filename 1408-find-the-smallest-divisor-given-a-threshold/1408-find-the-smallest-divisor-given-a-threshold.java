class Solution {
    public boolean isposi(int[] nums,int t,int n){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]/n;
            if(nums[i]%n!=0){
                sum++;
            }
        }
        if(sum<=t){
            return true;
        }
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=(int)Math.pow(10,6);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(nums,threshold,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}