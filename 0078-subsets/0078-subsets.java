class Solution {
    public static void sub(int ind,ArrayList<Integer> li,int[] arr,int n,List<List<Integer>> subsets){
        if(ind>=n){
            subsets.add(new ArrayList<>(li));
            return;
        }
        sub(ind+1,li,arr,n,subsets);
        li.add(arr[ind]);
        sub(ind+1,li,arr,n,subsets);
        li.remove(li.size()-1);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> sub=new ArrayList<>();
    ArrayList<Integer> li=new ArrayList<>();
    int ind=0;
      int n=nums.length;
       sub(ind,li,nums,n,sub);
       return sub;
    }
}