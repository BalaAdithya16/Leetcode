class Solution {
    public static boolean isposi(int[] p,int m,int mid){
       m-=1;
       Arrays.sort(p);
       int l=0;
       for(int r=1;r<p.length;r++){
           int temp=Math.abs(p[l]-p[r]);
           if(temp>=mid){
               m-=1;
               l=r;
           }
           if(m==0){
               return true;
           }
       }
       return false;
    }
    public int maxDistance(int[] position, int m) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(position,m,mid)){
              l=mid+1;
            }
            else{
              r=mid-1;
            }
        }
        return r;
    }
}