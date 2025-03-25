class Solution {
    public static boolean isposi(int[] c,long k,int mid){
        for(int i=0;i<c.length;i++){
            if(mid<=c[i]){
                int div=c[i]/mid;
                  k-=div;
            }
            if(k<=0){
                return true;
            }
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=(int)Math.pow(10,7);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(candies,k,mid)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return r;
    }
}