class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='(' || a=='[' || a=='{'){
                st.push(a);
            }
            else if(st.isEmpty()){
                return false;
            }
            else if(a==')' && st.peek()=='(' || a==']' && st.peek()=='[' || a=='}' && st.peek()=='{' ){
                st.pop();
            }
            else{
                st.push(a);
            }
            }
            if(!st.isEmpty()){
                return false;
            }
            return true;
    }
}