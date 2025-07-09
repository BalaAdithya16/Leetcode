class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> hm1=new HashMap<>();
        HashMap <Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        for(char i:hm1.keySet()){
            if(!hm2.containsKey(i)){
                return false;
            }
            int a=hm1.get(i);
            int b=hm2.get(i);
            if(a>b){
                return false;
            }
        }
        return true;
    }
}