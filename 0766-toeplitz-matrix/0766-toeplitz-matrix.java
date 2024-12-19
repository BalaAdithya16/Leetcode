class Solution {
    public boolean A(int[][] matrix,int x,int y){
       int r=matrix.length;
       int c=matrix[0].length;
        int i=x;
        int j=y;
        boolean a=true;
        int temp=matrix[i][j];
        while(i<r && j<c){
            if(matrix[i][j]!=temp){
                a=false;
            }
            i++;
            j++;
            }
            return a;
        
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
         int r = matrix.length;
        int c = matrix[0].length;
        boolean b=true;
        for(int k=0;k<c;k++){
            boolean temp=A(matrix,0,k);
            if(temp==false){
                b=false;
                break;
            }
        }
         for(int k=1;k<r;k++){
            boolean temp=A(matrix,k,0);
            if(temp==false){
                b=false;
                break;
            }
        }
        return b;
    }
}