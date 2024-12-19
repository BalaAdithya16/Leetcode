class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean b=false;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        if(nums.length!=hs.size()){
            b=true;
        }
        return b;
    }
}