class Solution {
    public boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length())
    return false;
        HashMap<Character,Character> al=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
        if(al.containsKey(s.charAt(i))==false)
        {
            if(al.containsValue(t.charAt(i))==false)
                    al.put(s.charAt(i),t.charAt(i));
            else
            return false;
        }
        else
        {
            char c=al.get(s.charAt(i));
            if(c!=t.charAt(i))
            return false;
        }
    }
       return true;
    }
}