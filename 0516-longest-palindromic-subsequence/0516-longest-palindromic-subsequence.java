class Solution {
    public int longestPalindromeSubseq(String s) {
       int dp[][]=new int[(s.length())][(s.length())];
        
        for(int arr[]:dp)
        Arrays.fill(arr,-1);

        return solver(0,s.length()-1,s,dp);
    }
    int solver(int i,int j,String s,int dp[][])
    {
        if(i==j)
        return 1;
        if(i>j)
        return 0;

        if(dp[i][j] !=-1)
        return dp[i][j];

        if(s.charAt(i)==s.charAt(j))
        {
            dp[i][j]=2+solver(i+1,j-1,s,dp);
        }
        else
        dp[i][j]=Math.max(solver(i+1,j,s,dp),solver(i,j-1,s,dp));

        return dp[i][j];
    }
}