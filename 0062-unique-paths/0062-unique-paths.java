class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int row[] : dp)
        Arrays.fill(row,-1);
        dp[0][0]=1;
        for(int i=0;i<m;i++)
        {
                int up=0;
                int down=0;
            for(int j=0;j<n;j++)
            {
                if(i==00 && j==0)
                dp[0][0]=1;
                else{
                if(i>0)
                up=dp[i-1][j];
                if(j>0)
                down=dp[i][j-1];
               dp[i][j]=up+down;
               }              
            }
        }
        return dp[m-1][n-1];
        // return rec(m-1,n-1,dp);
    }
    int rec(int n,int m,int dp[][])
    {
        if(n==0 && m==0)
        return 1;
        if(n<0 || m<0)
        return 0;
        if(dp[n][m]!=-1)
        return dp[n][m];

        int up=rec(n-1,m,dp);
        int down=rec(n,m-1,dp);
        dp[n][m]=up+down;
        return up+down;
    }
}