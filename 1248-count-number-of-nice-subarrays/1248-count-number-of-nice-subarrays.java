class Solution {
    public int atmost(int[] arr,int k){
        int l=0;
        int temp=0;
        int ans=0;
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
        int a1=atmost(nums,k)-atmost(nums,k-1);
        return a1;
    }
}