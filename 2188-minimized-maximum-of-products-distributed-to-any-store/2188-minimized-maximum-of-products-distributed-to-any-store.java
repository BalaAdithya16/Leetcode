class Solution {
    public static boolean isposi(int n,int[] q,int mid){
        for(int i=0;i<q.length;i++){
            int div=q[i]/mid;
            if(q[i]%mid!=0){
                div+=1;
            }
         n-=div;
        }
        if(n>=0){
            return true;
        }
        return false;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=(int)Math.pow(10,5);
        while(l<=r){
         int mid=l+(r-l)/2;
         if(isposi(n,quantities,mid)){
            r=mid-1;
         }
         else{
            l=mid+1;
         }
     }
      return l;
    }
}