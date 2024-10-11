class Solution {
    public char repeatedCharacter(String s) {

       HashMap<Character,Integer> al=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {char c=s.charAt(i);
        al.put(c,al.getOrDefault(c,0)+1);
        if(al.get(c)==2)
        return c;
    }
    return 'i';


    }
}