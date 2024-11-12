class Solution {
    public int lengthOfLongestSubstring(String s) {
    if(s.length()==1)
    return 1;
     int arr[]=new int[256];
     Arrays.fill(arr,-1);
    int r=0,l=0,len=0,max=0;
    while(r<s.length())
    {
        if(arr[s.charAt(r)]!=-1)
        {
            if(arr[s.charAt(r)]>=l)
            l=arr[s.charAt(r)]+1;
        }
        len=r-l+1;
        max=Math.max(len,max);
        arr[s.charAt(r)]=r;
        r++;
    }
    return max;
    }
}