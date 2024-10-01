class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> al=new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='{'||c=='[')
            {
            al.push(c);
            }
            else
            {
                if(al.isEmpty())
                return false;
                else if(isMatching(al.peek(),c)==false)
                return false;
                else
                al.pop();
                
            }
           
        }
     return al.isEmpty();
    }

    boolean isMatching(char a,char b)
    {
        if(a=='('&&b==')'|| a=='{'&& b=='}'|| a=='['&& b==']')
        {
            return true;
        }
        else
        return false;
    }
}