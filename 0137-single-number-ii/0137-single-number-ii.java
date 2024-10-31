class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer,Integer> h=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      h.put(nums[i],h.getOrDefault(nums[i],0)+1);
      for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            if(e.getValue()==1)
            return e.getKey();
        }
    return 0;
    }
}