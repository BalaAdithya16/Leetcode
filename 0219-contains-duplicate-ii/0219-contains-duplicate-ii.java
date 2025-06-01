class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        for(int r=0;r<nums.length;r++){
            int a=nums[r];
            if(!hm.containsKey(a)){
                hm.put(a,1);
            }
            else{
                if(r-l<=k){
                    return true;
                }
            }
            if(hm.size()>k){
                hm.remove(nums[l]);
                l++;        
            }
        }
        return false;
    }
}