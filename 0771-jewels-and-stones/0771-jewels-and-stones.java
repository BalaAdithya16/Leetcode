class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> h=new HashMap<>();
      for(int i=0;i<stones.length();i++){
          char a=stones.charAt(i);
          h.put(a,h.getOrDefault(a,0)+1);
      }
      int sum=0;
      for(int i=0;i<jewels.length();i++){
          if(h.containsKey(jewels.charAt(i))){
              sum+=h.get(jewels.charAt(i));
          }
          }
          return sum;
      
    }
}