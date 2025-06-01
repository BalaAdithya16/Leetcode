class Solution {
    public int[] plusOne(int[] digits) {
        int[] newarr=new int[digits.length+1];
        if(digits[digits.length-1]<9){
            digits[digits.length-1]+=1;
        }
        else{
            int n=digits.length-1;
            while(digits[n]==9){
                if(n==0){
                    newarr[0]=1;
                    return newarr;
                }
                digits[n]=0;
                n--;
            }
            digits[n]+=1;
        }
        return digits;
    }
}