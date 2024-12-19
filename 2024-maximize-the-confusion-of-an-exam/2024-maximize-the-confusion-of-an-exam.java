class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int c0=0;
        int c1=0;
        int l=0;
        int ans=0;
        int n=answerKey.length();
        for(int r=0;r<n;r++){
            if(answerKey.charAt(r)=='T'){
                c0++;
            }
            else{
                c1++;
            }
            while(Math.min(c0,c1)>k){
                if(answerKey.charAt(l)=='T'){
                    c0--;
                }
                else{
                    c1--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
        
    }
}