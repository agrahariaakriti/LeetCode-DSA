class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle.length()==1)
        return (int)columnTitle.charAt(0)+1-'A';
    
        int l=columnTitle.length();
        int n=0,j=0;
        for(int i=l-1;i>=0;i--)
        {
           n+=(int)Math.pow(26,i)*(((int)columnTitle.charAt(j)+1)-'A');j++;
        }
        return n;
    }
}