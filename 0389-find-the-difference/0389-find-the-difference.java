class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> al=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {Character c1=s.charAt(i);
        al.put(c1,al.getOrDefault(c1,0)+1);
        }
        for(int i=0;i<t.length();i++){
        Character c1=t.charAt(i);
        al.put(c1,al.getOrDefault(c1,0)+1);
        }
        char res='i';
        for(Map.Entry<Character,Integer> e:al.entrySet())
        {
            if(e.getValue()%2!=0)
            {
                res=e.getKey();
            }
        }
        return res;

    }
}