class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            if(hm.containsKey(jewels.charAt(i))){
                c+=hm.get(jewels.charAt(i));
            }
        }
        return c;
    }
}