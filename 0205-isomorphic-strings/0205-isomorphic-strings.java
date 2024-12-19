class Solution {
    public boolean isIsomorphic(String s, String t) {
         HashMap<Character,Character> j=new HashMap<>();
        HashMap<Character,Character> h=new HashMap<>();
        boolean e=true;
        boolean f=true;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char g=t.charAt(i);
            if(h.containsKey(c)){
                if(h.get(c)!=g){
                  e=false;
                  break;
              }
            }
        else{
            h.put(c,g);
        }
        if(j.containsKey(g)){
                if(j.get(g)!=c){
                  e=false;
                  break;
              }
            }
        else{
            j.put(g,c);
        }
        
    }
    return e;
    }
}