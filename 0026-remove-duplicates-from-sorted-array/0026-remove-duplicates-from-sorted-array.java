class Solution {
    public int removeDuplicates(int[] nums) {
       int l=0;
       int count=1;
       for(int i=1;i<nums.length;i++){
         if(nums[i]!=nums[l]){
            nums[l+1]=nums[i];
            l++;
            count++;
         }
       }
       return count;
}
}