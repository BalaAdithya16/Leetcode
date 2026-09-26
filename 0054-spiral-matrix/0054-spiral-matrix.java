class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li=new ArrayList<>();
        int ro=matrix.length;
        int c=matrix[0].length;
        int t=0;
        int l=0;
        int r=c-1;
        int b=ro-1;
        while(l<=r && t<=b){
        for(int i=l;i<=r;i++){
            li.add(matrix[t][i]);
        }
            t++;
        for(int i=t;i<=b;i++){
            li.add(matrix[i][r]);
        }
            r--;
        if(t<=b){
        for(int i=r;i>=l;i--){
            li.add(matrix[b][i]);
        }
            b--;
        }
        if(l<=r){
        for(int i=b;i>=t;i--){
            li.add(matrix[i][l]);
        }
        l++;
        }
    }
    return li;
    }
}