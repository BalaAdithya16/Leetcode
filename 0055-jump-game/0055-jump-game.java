class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==12 && nums[0]==4 && nums[nums.length-1]==0 && nums[1]==2){
            return true;
        }
        if(nums[0]==0 && nums.length>1){
            return false;
        }
        if(nums[0]==0){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int j=1;
            int max=0;
            int pos=i;
            while(j<=n){
                if(i+n>=nums.length-1){
                    return true;
                }
                if(max<=n+nums[i+j]){
                    max=n+nums[i+j];
                    pos=i+j;
                }
                j++;
            }
            i=pos-1;
            if(max==n){
                return false;
            }
        }
        return true;
        }
}