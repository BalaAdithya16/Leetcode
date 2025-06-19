class Solution {
    public boolean isposi(int[] p,int h,int n){
        int sum=0;
        for(int i=0;i<p.length;i++){
            sum+=p[i]/n;
            if(p[i]%n!=0){
                sum+=1;
            }
        }
        h-=sum;
        if(h>=0){
            return true;
        }
            return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(piles,h,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}