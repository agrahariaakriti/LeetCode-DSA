class Solution {
    public String reverseWords(String s) {
      
        String  s2[]=s.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder s1=new StringBuilder(s2[i]);
            s2[i]=s1.reverse().toString();
        }
        String s3="";
        for(int i=0;i<s2.length-1;i++)
            s3+=s2[i]+" ";

        s3+=s2[s2.length-1];
        return s3;
    }
}