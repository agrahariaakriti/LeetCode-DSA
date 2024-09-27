class Solution {
    public boolean isSubsequence(String s, String t) {
        char p1='0',p2='0';
        int count=0;
        if(s.length()>0){
        for(int i=0;i<t.length();i++)
        {
            if(s.length()!=count){
            p1=s.charAt(count);
            p2=t.charAt(i);
            if(p1==p2)
            count++; }
            else 
            break;
        }}
        if(count==s.length())return true;
        else return false;


    }
}