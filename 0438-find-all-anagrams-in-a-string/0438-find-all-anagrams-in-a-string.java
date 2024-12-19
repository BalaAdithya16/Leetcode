class Solution {
    public static Boolean equals(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
        if(hm1.size()!=hm2.size()){
                return false;
                }
            for(char i:hm1.keySet()){
                if(!hm2.containsKey(i)){
                    return false;
                }
                int a=hm1.get(i);
                int z=hm2.get(i);
                if(a!=z){
                    return false;
                }
            }
       return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
       HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            char temp=p.charAt(i);
            hm1.put(temp,hm1.getOrDefault(temp,0)+1);
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            char temp=s.charAt(r);
            hm2.put(temp,hm2.getOrDefault(temp,0)+1);
              if(r-l+1==p.length()){
                  Boolean b=equals(hm1,hm2);
                  if(b){
                      l1.add(l);
                  }
             hm2.put(s.charAt(l),hm2.get(s.charAt(l))-1);
             if(hm2.get(s.charAt(l))==0){
                 hm2.remove(s.charAt(l));
             }
            l++;
              } 
        }
        return l1;
    }
}

                   