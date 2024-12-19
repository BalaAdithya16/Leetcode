class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> hs=new HashSet<>();
       int l=0;
       int ans=0;
       for(int r=0;r<s.length();r++){
           char temp=s.charAt(r);
           
           if(hs.contains(temp)){
               while(s.charAt(l)!=temp){
                   hs.remove(s.charAt(l));
                   l++;
               }
               l++;
           }
           else{
           hs.add(temp);
       }
       ans=Math.max(ans,r-l+1);
       }
       return ans;
    }
}