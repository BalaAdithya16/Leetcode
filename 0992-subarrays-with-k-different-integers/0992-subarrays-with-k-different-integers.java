class Solution {
    public static int atmost(int[] nums,int k){
    HashMap<Integer,Integer> hm=new HashMap<>();
       int l=0;
       int ans=0;
       for(int r=0;r<nums.length;r++){
           int temp=nums[r];
           hm.put(temp,hm.getOrDefault(temp,0)+1);
           while(hm.size()>k){
               hm.put(nums[l],hm.get(nums[l])-1);
               if(hm.get(nums[l])==0){
                   hm.remove(nums[l]);
               }
               l++;
           }
          ans+=r-l+1; 
       }
       return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int A=atmost(nums,k)-atmost(nums,k-1);
        return A;
    }
}