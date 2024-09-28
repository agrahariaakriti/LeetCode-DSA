class Solution {
    public int majorityElement(int[] nums) {
       int n=(nums.length/2);
       HashMap<Integer,Integer> h=new HashMap<>(); 
        for(int x:nums)
        h.put(x,h.getOrDefault(x,0)+1);
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            if(e.getValue()>n)
            return e.getKey();
        }
return 0;
    }
}