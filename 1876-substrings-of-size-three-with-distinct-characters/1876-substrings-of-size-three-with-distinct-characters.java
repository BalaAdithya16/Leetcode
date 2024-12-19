class Solution {
    public int countGoodSubstrings(String s) {
    int l=0;
    int ans=0;
    HashMap<Character,Integer> hm=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(r-l==3){
                char c1=s.charAt(l);
                hm.put(c1,hm.get(c1)-1);      
            if(hm.get(c1)==0){
               hm.remove(c1); 
            }
                l++;
            }
            if(hm.size()==3){
                ans+=1;
            }
        }
        return ans;
    }
}