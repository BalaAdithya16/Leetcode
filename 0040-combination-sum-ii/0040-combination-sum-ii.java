class Solution {
    public static void sub(int ind,int arr[],int n,List<Integer> li,int k,List< List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList(li));
            return;
        }
        for(int i=ind;i<n;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>k){
                break;
            }
            li.add(arr[i]);
            sub(i+1,arr,n,li,k-arr[i],ans);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List< List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        int n=candidates.length;
        Arrays.sort(candidates);
        sub(0,candidates,n,li,target,ans);
        return ans;
    }
}