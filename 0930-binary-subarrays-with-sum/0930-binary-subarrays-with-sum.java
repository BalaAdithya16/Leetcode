class Solution {
    public static int subcount(int[] nums,int g){
        if(g<0){
            return 0;
        }
        int l=0;
        int c=0;
        int temp=0;
        for(int r=0;r<nums.length;r++){
            temp+=nums[r];
            while(temp>g){
                temp-=nums[l];
                l++;
            }
            c+=r-l+1;
        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subcount(nums,goal)-subcount(nums,goal-1);
    }
}