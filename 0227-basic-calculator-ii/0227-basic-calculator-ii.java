class Solution {
    public int calculate(String s) {
        ArrayDeque<Integer> al=new ArrayDeque<>();
        int no=0;
        char sign='0';

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                no=no*10+(c-'0');
            }
            if(c!=' ' && !Character.isLetterOrDigit(c) || i==s.length()-1)
            {
                if(sign=='0')
                al.push(no);

                if(sign=='+')
                al.push(no);
                
                if(sign=='-')
                al.push(-no);

                if(sign=='*')
                {
                    int n1=al.pop();
                    al.push(n1*no);
                }
                if(sign=='/')
                {
                    int n1=al.pop();
                    al.push(n1/no);
                }
                no=0;
                sign=c;
            }
        }
        int sum=0;
        while(!al.isEmpty())
        sum+=al.pop();
        return sum;
    }
}