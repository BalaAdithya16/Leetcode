class Solution {
    public int lengthOfLastWord(String s) {
     int c=0;
    for(int i=s.length()-1;i>=0;i--){
        if(Character.isLetter(s.charAt(i))){
            c+=1;
            if(i!=0){
            if(!Character.isLetter(s.charAt(i-1))){
                break;
            }
            }
        }
    }
        return c;
    }
        
}