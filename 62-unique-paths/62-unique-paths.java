class Solution {
    /*
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                dp[i][j]=-1;
            }
        }
        int ans=uniquePaths(0,0,m-1,n-1,dp);
        return ans;
    }
    public int uniquePaths(int i,int j,int m, int n,int[][] dp) {
        if(i==(n-1) && j==(m-1)) return dp[i][j]= 1;
        if(i>=n && j>=m) return dp[i][j] = 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=uniquePaths(i+1,j,m,n,dp)+uniquePaths(i,j+1,m,n,dp);
        
    }
    */
    public int uniquePaths(int m, int n) {
    return uniquePathsHelper(m - 1, n - 1, new int[n][m]);
  }
  
  private int uniquePathsHelper(int m, int n, int[][] memo) {
    if (m < 0 || n < 0) {
      return 0;
    } else if (m == 0 || n == 0) {
      return 1;
    } else if (memo[n][m] > 0) {
      return memo[n][m];
    } else {
      memo[n][m] = uniquePathsHelper(m - 1, n, memo) + uniquePathsHelper(m, n - 1, memo);
      return memo[n][m];
    }
  }
}