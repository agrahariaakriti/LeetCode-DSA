class Solution {
    public int reverse(int x) {
        int x2=x;
        if(x<0)
        x=x*-1;
        int res=0;
        while(x>0)
        {
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE && res%10>7))
            return 0;
            int rem=x%10;
            res=res*10+rem;
            x=x/10;
        }
        if(x2<0)
        return res*-1;
        else
        return res;

    }
}