class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] posi=new int[nums.length/2];
        int[] negi=new int[nums.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                posi[p]=nums[i];
                p++;
            }
            else{
                negi[n]=nums[i];
                n++;
            }
        }
        int[] ans=new int[nums.length];
        p=0;
        n=0;
        int c=0;
        for(int i=0;i<ans.length/2;i++){
            ans[c]=posi[p];
            c++;
            ans[c]=negi[n];
            c++;
            p++;
            n++;
        }
        return ans;
    }
}