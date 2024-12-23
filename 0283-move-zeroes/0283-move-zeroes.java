class Solution {
    public void moveZeroes(int[] nums) {
      for(int l=0;l<nums.length;l++){
        if(nums[l]==0){
        for(int r=l+1;r<nums.length;r++){
             if(nums[r]!=0){
                 int temp=nums[r];
                 nums[r]=nums[l];
                 nums[l]=temp;
                 break;
             }     
        }
    }
  }
}
}