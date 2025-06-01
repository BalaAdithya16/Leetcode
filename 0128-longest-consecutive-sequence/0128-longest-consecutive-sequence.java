class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        if(nums.length==0){
            return 0;
        }
        int ans=0;
        for(int i:hs){
            int a=i;
            if(!hs.contains(a-1)){
                int temp=1;
                while(hs.contains(a+1)){
                    temp++;
                    a+=1;
                }
                ans=Math.max(ans,temp);
            }
        }
        return ans;
    }
}