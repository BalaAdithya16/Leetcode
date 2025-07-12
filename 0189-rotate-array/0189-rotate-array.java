class Solution {
    public void reverse(int[] arr,int fi,int la){
        int l=fi;
        int r=la;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
       if(nums.length>1){
        int n=nums.length-1;
        k=k%nums.length-1;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n);
        reverse(nums,0,n);
       }
    }
}