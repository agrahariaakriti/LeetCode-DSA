class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.equals(""))
        return word2.length();
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int  arr[]: dp)
        Arrays.fill(arr,-1);
     return solver(word1.length(),word2.length(),word1,word2,dp);   
    }
    int solver(int i ,int j,String word1,String word2,int dp[][])
    {
        if(j==0)
        return i;
        if(i==0)
        return j;

        if(dp[i][j] !=-1)
        return dp[i][j];

        if(word1.charAt(i-1)==word2.charAt(j-1))
        dp[i][j]= 0+solver(i-1,j-1,word1,word2,dp);
        else
        {
            int insert=1+solver(i,j-1,word1,word2,dp);
            int delete=1+solver(i-1,j,word1,word2,dp);
            int replace=1+solver(i-1,j-1,word1,word2,dp);
            dp[i][j]= Math.min(insert,Math.min(delete,replace));
        }
        return dp[i][j];

    }
}