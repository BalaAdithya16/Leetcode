class Solution {
    public int myAtoi(String s) {
        int sign=1;
        int ans=0;
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!Character.isSpace(c)){
                if(c=='-' || c=='+'){
                    if(c=='-'){
                        sign=-1;
                    }
                    count++;
                    if(count==2){
                        break;
                    }
                    if(count==1 && sb.length()>0){
                        sign=1;
                        break;
                    }
                }
                else if((int)c>=48 && (int)c<=57){
                    sb.append(c);
                }
                else{
                    break;
                }
            }
            else{
                if(!sb.isEmpty() || count>0){
                    break;
                }            
            }
        }
         int i=0;
         if(sb.isEmpty()){
                sb.append('0');
             }
     else{
         while(sb.charAt(i)=='0'){
             sb.deleteCharAt(i);
             if(sb.isEmpty()){
                sb.append('0');
                break;
             }
         }
     }
        try {
        ans = Integer.valueOf(sb.toString());  
        } 
        catch (NumberFormatException e) {
            ans = Integer.MAX_VALUE;
         if(sign==-1){
            return ans=Integer.MIN_VALUE;
         }
    }
    if(sign==-1){ 
        return ans*=-1;
    }
    return ans;
    }
}