class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
             ans=Math.max(sentences[i].split(" ").length,ans);
             }
             
         
         return ans;
            
    }
}