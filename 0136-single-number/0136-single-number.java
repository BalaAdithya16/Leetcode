class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                return i;
            }
        }
        return 1;
    }
}