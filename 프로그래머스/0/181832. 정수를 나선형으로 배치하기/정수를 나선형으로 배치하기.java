class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        int x=0;
        int y=0;
        int cnt=1;

        while(cnt <= n*n){
            for(int i=y; i<n; i++){
                if(!visited[x][i]){
                    visited[x][i] = true;
                    arr[x][i] = cnt++;
                    y = i;
                }
            }
            for(int i=x; i<n; i++){
                if(!visited[i][y]){
                    visited[i][y] = true;
                    arr[i][y] = cnt++;
                    x = i;
                }
            }
            for(int i=y; i>=0; i--){
                if(!visited[x][i]){
                    visited[x][i] = true;
                    arr[x][i] = cnt++;
                    y = i;
                }
            }
            for(int i=x; i>=0; i--){
                if(!visited[i][y]){
                    visited[i][y] = true;
                    arr[i][y] = cnt++;
                    x = i;
                }
            }
        }
        return arr;
    }
}