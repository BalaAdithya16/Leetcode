class Solution {
    public static boolean equal(HashMap<Character,Integer>hm1,HashMap<Character,Integer>hm2){
        if(hm1.size()!=hm2.size()){
            return false;
        }
        for(char i:hm2.keySet()){
            if(!hm1.containsKey(i)){
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
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char temp=s1.charAt(i);
            hm1.put(temp,hm1.getOrDefault(temp,0)+1);
        }
        int l=0;
        boolean b=false;
        int k=s1.length();
        for(int r=0;r<s2.length();r++){
            char temp=s2.charAt(r);
            if(r-l+1<=k){
                hm2.put(temp,hm2.getOrDefault(temp,0)+1);
            }
        if(r-l+1==k){
            b=equal(hm1,hm2);
            if(b){
                break;
            }
            else{
                hm2.put(s2.charAt(l),hm2.get(s2.charAt(l))-1);
                if(hm2.get(s2.charAt(l))==0){
                    hm2.remove(s2.charAt(l));
                }
                l++;
            }
        }
        }
        return b;
    }
}