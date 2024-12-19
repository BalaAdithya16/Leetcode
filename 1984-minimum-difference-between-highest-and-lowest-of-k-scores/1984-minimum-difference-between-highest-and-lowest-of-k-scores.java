class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(r-l==k){
                l++;
            }
            if(r-l+1==k){  
        int temp=nums[r]-nums[l];
        ans=Math.min(ans,temp);
        
    }
        }
        return ans;
    
    }
}