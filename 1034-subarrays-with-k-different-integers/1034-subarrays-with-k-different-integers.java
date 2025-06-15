class Solution {
    public int countsub(int[] arr,int k){
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=0;
        int l=0;
        for(int r=0;r<arr.length;r++){
            hm.put(arr[r],hm.getOrDefault(arr[r],0)+1);
            while(hm.size()>k){
                hm.put(arr[l],hm.get(arr[l])-1);
                if(hm.get(arr[l])==0){
                    hm.remove(arr[l]);
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countsub(nums,k)-countsub(nums,k-1);
    }
}