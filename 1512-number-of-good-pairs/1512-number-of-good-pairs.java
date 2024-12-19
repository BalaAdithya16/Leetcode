class Solution {
    public int numIdenticalPairs(int[] nums) {
      HashMap<Integer,Integer> h=new HashMap<>();
      for(int i=0;i<nums.length;i++){
          int val=nums[i];
          if(h.containsKey(val)){
              h.put(val,h.get(val)+1);
              
          }
          else{
              h.put(val,1);
          }
      }
      int sum=0;
      for(int i:h.keySet()){
          int p=h.get(i);
          sum+=((p-1)*(p-1+1))/2;
      }
          return sum;
      
        
    }
}