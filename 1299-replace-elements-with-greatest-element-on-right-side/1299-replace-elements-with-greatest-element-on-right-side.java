class Solution {
    public int[] replaceElements(int[] arr) {
                   int rm=-1;
           for(int i=arr.length-1;i>=0;i--){
               int cur=arr[i];
               arr[i]=rm;
               rm=Math.max(rm,cur);
           }
          
          return arr;
    }
}