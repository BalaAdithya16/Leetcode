class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=97;i<=122;i++){
            char c=(char)i;
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
        }
        for(char i:hm.keySet()){
            if(hm.get(i)==1){
                return false;
            }
        }
        return true;
    }
}