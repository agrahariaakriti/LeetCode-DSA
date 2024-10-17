class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int n1=word1.length();
        int n2=word2.length();
        int i=0,j=0;
        String s="";
        while(i<n1 && j<n2)
        {
            s+=word1.charAt(i);
            s+=word2.charAt(j);;
            i++;j++;
        }
        while(i<n1)
        s+=word1.charAt(i++);

        while(j<n2)
        s+=word2.charAt(j++);
        return s;

    }
}