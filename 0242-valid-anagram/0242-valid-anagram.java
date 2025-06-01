class Solution {
    public boolean tell(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
        if(hm1.size()!=hm2.size()){
            return false;
        }
        for(char i:hm1.keySet()){
            if(!hm2.containsKey(i)){
                return false;
            }
            int a=hm1.get(i);
            int b=hm2.get(i);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        return tell(hm1,hm2);
    }
}