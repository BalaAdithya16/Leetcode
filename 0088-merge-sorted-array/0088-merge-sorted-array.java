class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int l=0;
        int r=0;
        int i=0;
        while(m>0 && n>0){
            if(nums1[l]<=nums2[r]){
                ans[i]=nums1[l];
                i++;
                l++;
                m--;
            }
            else{
                ans[i]=nums2[r];
                i++;
                r++;
                n--;
            }
        }
        while(m>0){
            ans[i]=nums1[l];
                i++;
                l++;
                m--;
        }
       while(n>0){
            ans[i]=nums2[r];
                i++;
                r++;
                n--;
       }
       for(int j=0;j<ans.length;j++){
        nums1[j]=ans[j];
       }
    }
}