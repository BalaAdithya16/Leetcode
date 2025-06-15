class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int l=0;
        long ans=0;
        long temp=0;
        for(int r=0;r<nums.length;r++){
            temp+=nums[r];
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            if(r-l+1==k){
                if(hm.size()==k){
                ans=Math.max(ans,temp);
                }
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                temp-=nums[l];
                l++;
        }
    }
        return ans;
    }
}