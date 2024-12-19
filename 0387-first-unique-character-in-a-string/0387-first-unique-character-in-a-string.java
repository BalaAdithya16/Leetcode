class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
                hm.put(temp,hm.getOrDefault(temp,0)+1);
        }
        for(Character i:hm.keySet()){
            if(hm.get(i)==1){
               ans=s.indexOf(i);
               break;
            }
            else{
                ans=-1;
            }
        }
      return ans;
    }
}