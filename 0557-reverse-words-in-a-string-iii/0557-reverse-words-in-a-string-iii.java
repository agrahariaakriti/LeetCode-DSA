class Solution {
    public String reverseWords(String s) {
      StringBuilder sb=new StringBuilder("");
      StringBuilder sb1=new StringBuilder("");
        String  s2[]=s.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder sb2=new StringBuilder(s2[i]);
            sb.append(sb2.reverse().toString());
            if(i!=s2.length-1)
            sb.append(" ");
        }
        return sb.toString();
    }
}