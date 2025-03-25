class Solution {
     public static boolean posi(int nums[],int thr,int k){
            int temp=0;
            for(int i=0;i<nums.length;i++){
                  temp+=nums[i]/k;
                  if(nums[i]%k!=0){
                    temp++;
                  }
            }
        if(temp<=thr){
            return true;
        }

    return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
    Arrays.sort(nums);
    int l=1;
    int r=nums[nums.length-1];
    while(l<=r){
        int mid=l+(r-l)/2;
        boolean b=posi(nums,threshold,mid);
        if(b){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
        }
        return l;
    }
}
