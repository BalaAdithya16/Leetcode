class Solution {
    public String decodeMessage(String key, String message) {
         HashMap<Character,Character> h=new HashMap<>();
       int e=97;
       for(int i=0;i<key.length();i++){
           char c=key.charAt(i);
          if(c!=' ' && !h.containsKey(c)){
           h.put(c,(char)e);
        e++;
          }
       }
       String ans="";
       for(int i=0;i<message.length();i++){
           char z=message.charAt(i);
           if(z==' '){
               ans+=' ';
           }
            else{
           char y=h.get(z);
           ans+=y;
           }
           
       }
      return ans;
    }
}