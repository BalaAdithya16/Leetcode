class Solution {
    public static boolean isposi(int[] piles,int num,int h){
        for(int i=0;i<piles.length;i++){
            int temp=0;
             temp+=piles[i]/num;
             if(piles[i]%num!=0){
                temp++;
             }
             h-=temp;
        }
      if(h<0){
        return false;
      }
     return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l=1;
        int r=1000000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isposi(piles,mid,h)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
    return l;
    }
}