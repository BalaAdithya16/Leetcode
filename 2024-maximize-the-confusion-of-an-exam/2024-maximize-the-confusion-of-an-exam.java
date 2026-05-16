class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;
        int tc=0;
        int fc=0;
        int ans=0;
        for(int r=0;r<answerKey.length();r++){
            if(answerKey.charAt(r)=='T'){
                tc++;
            }
            else{
                fc++;
            }
            while(tc>k && fc>k){
                if(answerKey.charAt(l)=='T'){
                    tc--;
                }
                else{
                    fc--;
                }
                l++;
            }
            int min=Math.min(tc,fc);
            if(min<=k){
                ans=Math.max(ans,r-l+1);
            }
        }
        return ans;
    }
}