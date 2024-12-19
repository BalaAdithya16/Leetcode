class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> a= new ArrayList<>();
           for(int i=0;i<nums.length-1;i++){
               for(int j=i+1;j<nums.length;j++){
                   if(nums[i]+nums[j]==target){
                       a.add(i);
                       a.add(j);
                       break;
                   }
               }
           } 
           int [] arr=new int[a.size()];
        for(int i=0;i<a.size();i++){
            arr[i]=a.get(i);
        }
        return arr;
    
        
    }
}