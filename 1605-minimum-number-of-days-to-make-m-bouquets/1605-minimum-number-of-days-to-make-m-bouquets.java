class Solution {
    public static boolean posi(int[] bd,int m,int k,int mid){
       int count=0;
       for(int i=0;i<bd.length;i++){
        if(bd[i]<=mid){
            count++;
        }
        else{
            count=0;
        }
        if(count==k){
            count=0;
            m-=1;
        }
       if(m==0){
        return true;
       }
       }
       return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(posi(bloomDay,m,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l>Math.pow(10,9)){
            return -1;
        }
        return l;
    }
}