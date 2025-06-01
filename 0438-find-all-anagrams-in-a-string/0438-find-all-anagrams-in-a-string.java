class Solution {
    public static boolean Tell(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
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
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList <Integer> li=new ArrayList<>();
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            hm2.put(c,hm2.getOrDefault(c,0)+1);
            if(r-l+1==p.length()){
                boolean b=Tell(hm1,hm2);
                if(b){
                    li.add(l);
                }
                hm2.put(s.charAt(l),hm2.get(s.charAt(l))-1);
                    if(hm2.get(s.charAt(l))==0){
                        hm2.remove(s.charAt(l));
                    }
                l++;
            }
        }
        System.out.println(li);
        return li;
    }
}