class Solution {
    public static void dfs(int[][] arr,boolean[] vis,int a){
        vis[a]=true;
        for(int j=0;j<arr.length;j++){
                if(arr[a-1][j]==1){
                    if(!vis[j+1]){
                        dfs(arr,vis,j+1);
                    }
                }
            }
        }
    public int findCircleNum(int[][] isConnected) {
        int ans=0;
        boolean[] vis=new boolean[isConnected.length+1];
        for(int i=1;i<=isConnected.length;i++){
            if(!vis[i]){
                dfs(isConnected,vis,i);
                ans++;
            }
        }
        return ans;
    }
}