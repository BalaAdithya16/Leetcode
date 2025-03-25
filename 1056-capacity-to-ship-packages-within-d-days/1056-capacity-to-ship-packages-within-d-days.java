class Solution {
    public static boolean isposi(int[] w,int days,int mid){
     int count=0;
     for(int i=0;i<w.length;i++){
        if(w[i]>mid){
            return false;
        }
        count+=w[i];
        if(count>mid){
            days-=1;
            count=0;
            i-=1;
        }
        if(days==0){
         return false;
     }
     }
     return true;
  }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(weights,days,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}