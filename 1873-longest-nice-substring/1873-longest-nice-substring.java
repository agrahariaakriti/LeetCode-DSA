class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2) return "";
      ArrayList<Character> al=new ArrayList<>();
      for(int i=0;i<s.length();i++)
        al.add(s.charAt(i));

        for(int i=0;i<s.length();i++)
        {
            if(al.contains(Character.toUpperCase(s.charAt(i))) && al.contains(Character.toLowerCase(s.charAt(i))))continue;
        String prv1=longestNiceSubstring(s.substring(0,i));
        String prv2= longestNiceSubstring(s.substring(i+1));
        return prv1.length()>=prv2.length()? prv1 : prv2;
        }
        return s;
      
    }
}