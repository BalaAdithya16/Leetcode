class Solution {
    public String longestCommonPrefix(String[] strs) {
       String s=strs[0];
        String ans="";
        int len=s.length();
        for(int i=1;i<strs.length;i++){
            int n=0;
            for(int j=0;j<strs[i].length();j++){
                if(j<s.length() && s.charAt(j)==strs[i].charAt(j)){
                    n+=1;
                }
                else{
                break;
                }
            }
            n=Math.min(n,len);
            len=n;
        }
        for(int i=0;i<len;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
}
