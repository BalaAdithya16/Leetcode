class Solution {
    public static void sub(int ind,int arr[],int n,List<Integer> li,int k,int sum,List< List<Integer>> ans){
        if(ind==n){
            if(sum==k){
                List<Integer>ne=new ArrayList(li);
                ans.add(ne);
            }
            return;
        }
        if(sum>k){
            return;
        }
        sum+=arr[ind];
        li.add(arr[ind]);
        sub(ind,arr,n,li,k,sum,ans);
        sum-=arr[ind]; 
        li.remove(li.size()-1);
        sub(ind+1,arr,n,li,k,sum,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List< List<Integer>> ans=new ArrayList<>();
       List<Integer> li=new ArrayList<>(); 
       int n=candidates.length;
       sub(0,candidates,n,li,target,0,ans);
       return ans;
    }
}