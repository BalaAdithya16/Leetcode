class Solution {
    public static void sub(int ind,int[] arr,int n,List<List<Integer>> ans,List<Integer> li){
        ans.add(new ArrayList(li));
        if(ind==n){
            return;
        }
        for(int i=ind;i<n;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            li.add(arr[i]);
            sub(i+1,arr,n,ans,li);
            li.remove(li.size()-1); 
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        sub(0,nums,n,ans,new ArrayList<>());
        return ans;
    }
}