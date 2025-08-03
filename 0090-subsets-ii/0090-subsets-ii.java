class Solution {
    public static void sub(int ind,int[] arr,int n,List<List<Integer>> ans,List<Integer> li){
        if(ind>=n){
            if(!ans.contains(new ArrayList(li))){
                ans.add(new ArrayList(li));
            }
            return;
        }
        sub(ind+1,arr,n,ans,li);
        li.add(arr[ind]);
        sub(ind+1,arr,n,ans,li);
        li.remove(li.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        sub(0,nums,n,ans,new ArrayList<>());
        return ans;
    }
}