class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
      HashMap<String,Integer> hm=new HashMap<>();
        String a=paragraph.toLowerCase();
        String ans="";
        String[] b=a.split("[^a-zA-Z]+");
        for(int i=0;i<b.length;i++){
          String temp=b[i];
          if(!temp.isEmpty()){
              hm.put(temp,hm.getOrDefault(temp,0)+1);
          }
      }
     if(banned.length>0){
      for(int i=0;i<banned.length;i++){
          String temp=banned[i];
          if(hm.containsKey(temp)){
              hm.remove(temp);
          }
      }
     }
      System.out.println(hm);
      int c=0;
      for(String i:hm.keySet()){
          int temp=hm.get(i);
          if(c<temp){
              c=temp;
          }
      }
     for(String i:hm.keySet()){
          int temp=hm.get(i);
          if(temp==c){
              ans=i;
              break;
          }
    }
    return ans;
    }
}