class Solution {
    public static int sub(int[] num,int g){
     if(g<0){
         return 0;
     }
        int l=0;
        int temp=0;
        int ans=0;
        for(int r=0;r<num.length;r++){
            if(num[r]==1){
                temp+=1;
            }
            while(temp>g){
                if(num[l]==1){
                temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int A=sub(nums,goal)-sub(nums,goal-1);
        return A;
    }
}