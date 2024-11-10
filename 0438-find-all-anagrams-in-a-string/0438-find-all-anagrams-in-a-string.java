class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length())
        return new ArrayList<>();
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<p.length();i++)
        arr1[p.charAt(i)-'a']++;
        for(int i=0;i<p.length();i++)
        arr2[s.charAt(i)-'a']++;
        
        List<Integer> al=new ArrayList<>();
        int i=0;
        for(i=p.length();i<s.length();i++)
        {
            if(Arrays.equals(arr1,arr2))
            al.add(i-p.length());

            arr2[s.charAt(i)-'a']++;
            arr2[s.charAt(i-p.length())-'a']--; 
        }
        if(Arrays.equals(arr1,arr2))
            al.add(i-p.length());
        return al;
    }
}