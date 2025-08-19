class Solution {
    public int numDistinct(String s, String t) {
        int curr[]=new int[t.length()+1];
        int prv[]=new int[t.length()+1];
        // for(int i=0;i<=s.length();i++)
        curr[0]=prv[0]=1;

        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=t.length();j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    curr[j]=prv[j-1]+prv[j];
                }
                else
                curr[j]=prv[j];
            }
            for(int j=0;j<=t.length();j++)
            prv[j]=curr[j];
        }
        return curr[t.length()];
    }
}