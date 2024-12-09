class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> al=new ArrayDeque<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==')')
            {
             if(!al.isEmpty() && al.peek()=='(')
             al.pop();
             else
             return false;
            }
            else if(c==']')
            {
             if(!al.isEmpty() && al.peek()=='[')
             al.pop();
             else
             return false;
            }
            else if(c=='}')
            {
             if(!al.isEmpty() && al.peek()=='{')
             al.pop();
             else
             return false;
            }
            else
            {
                al.push(c);
            }
        }
        if(al.size()==0)
        return true;
        return false;

    }
}