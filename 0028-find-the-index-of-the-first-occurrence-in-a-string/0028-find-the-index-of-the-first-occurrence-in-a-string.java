class Solution {
    public int strStr(String haystack, String needle) {
        int lps[]=new int[needle.length()];
        lps(needle,lps);
       return kmp(haystack,needle,lps);
    }
    void lps(String str,int lps[])
    {
        int len=0,i=1;
        while(i<str.length())
        {
            if(str.charAt(i)==str.charAt(len))
            {
                len++;
                lps[i]=len;i++;
            }
            else
            {
                if(len==0)
                {
                    lps[i]=0;
                    i++;
                }
                else
                len=lps[len-1];
            }
        }
    }
    int kmp(String txt ,String ptn , int lps[])
    {
        int n=txt.length();
        int m=ptn.length();
        int i=0,j=0;
        while(i<n)
        {
            if(txt.charAt(i)==ptn.charAt(j))
            {i++;j++;}
            if(j==m)
            {
                return i-j;
            }
            else if(i<n && txt.charAt(i)!=ptn.charAt(j))
            {
                if(j==0)
                i++;
                else
                j=lps[j-1];
            }
        }
        return-1;
    }

}