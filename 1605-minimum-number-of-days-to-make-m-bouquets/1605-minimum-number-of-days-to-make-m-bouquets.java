class Solution {
    public boolean isposi(int[] bloo,int m,int k,int n){
        int temp=k;
        for(int r=0;r<bloo.length;r++){
            if(bloo[r]<=n){
                k-=1;
                if(k==0){
                    m-=1;
                    k=temp;
                    if(m==0){
                        return true;
                    }
                } 
            }
            else{
                k=temp;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=0;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(bloomDay,m,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l>(int)Math.pow(10,9)){
            return -1;
        }
        return l;

    }
}