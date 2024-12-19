class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
          int i=0;
          int k=colors.length-1;
          for(int j=1;j<colors.length;j++){
              if(colors[0]!=colors[j]){
                 int diff=Math.abs(i-j); 
                 max=Math.max(max,diff);
              }
          }
          for(int j=colors.length-2;j>=0;j--){
              if(colors[colors.length-1]!=colors[j]){
                  int dif=Math.abs(k-j);
                  max=Math.max(max,dif);
              }
          }
          
         return max;
        
    }
}