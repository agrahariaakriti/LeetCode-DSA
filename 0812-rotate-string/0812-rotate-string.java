class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        s=s+s;
        int i=s.indexOf(goal);
        if(i>=0)
            return true;
        else
        return false;

    }   
}