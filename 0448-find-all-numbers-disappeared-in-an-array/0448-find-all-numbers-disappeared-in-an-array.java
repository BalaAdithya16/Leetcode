class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       ArrayList<Integer> l=new ArrayList<>();
       HashMap<Integer,Integer> hm=new HashMap<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
           int temp=nums[i];
           hm.put(temp,hm.getOrDefault(temp,0)+1);
       }
        for(int i=1;i<=nums.length;i++){
            if(!hm.containsKey(i)){
                l.add(i);
            }
        }
        return l;
    }
}