class Solution {
    public int strStr(String haystack, String needle) {
    int s1=haystack.length();
    int l=0;
    int ans=-1;
    String s="";
    int k=needle.length();
    for(int r=0;r<s1;r++){
        s+=haystack.charAt(r);
        if(r-l+1==k){
            if(s.equals(needle)){
                 ans=l;
                break;
            }
           s= s.substring(1);
            l++;
        }
        
    }
    return ans;
    }
}