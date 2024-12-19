class Solution {
    public static boolean isPalindrome(int x) {
        int a=x;
        int ans=0;
        while(x>0){
            int temp=x%10;
            ans=ans*10+temp;
            x=x/10;   
        }
        return ans==a;
        
    
    }
}