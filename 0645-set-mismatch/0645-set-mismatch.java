class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet <Integer> hs=new HashSet<>();
       int n=nums.length;
       int miss=0;
       int dup=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
           if(!hs.contains(val)){
               hs.add(val);
           }else{
               dup=val;
           }
        }
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
                miss=i;
                break;
            }
        }
        int[] a={dup,miss};
        return a;
       }
}