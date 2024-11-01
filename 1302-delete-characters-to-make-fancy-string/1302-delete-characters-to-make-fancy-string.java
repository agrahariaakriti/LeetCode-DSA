class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3)
        return s;
        int i=0;
        StringBuffer sb=new StringBuffer();
        for(i=0;i<s.length()-2;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1) || s.charAt(i+1)!=s.charAt(i+2))
            sb.append(s.charAt(i));
        }
            sb.append(s.charAt(i));
            sb.append(s.charAt(i+1));
        
        return sb.toString();

    }
}