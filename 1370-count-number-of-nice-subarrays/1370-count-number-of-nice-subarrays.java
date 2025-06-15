class Solution {
    public int subcount(int[] arr,int k){
        int ans=0;
        int l=0;
        int temp=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2!=0){
                temp++;
            }
            while(temp>k){
                if(arr[l]%2!=0){
                    temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return subcount(nums,k)-subcount(nums,k-1);
    }
}