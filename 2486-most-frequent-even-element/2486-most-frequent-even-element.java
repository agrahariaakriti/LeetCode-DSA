class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> al=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        al.put(nums[i],al.getOrDefault(nums[i],0)+1);

        int max_count=Integer.MIN_VALUE;
        int max_key=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> e:al.entrySet())
        {
            if(e.getValue()>max_count && e.getKey()%2==0)
            {
                max_count=e.getValue();
            }
            
        }
        for(Map.Entry<Integer,Integer> e:al.entrySet())
        {
            if(e.getValue()==max_count && e.getKey()%2==0)
            {
            max_key=Math.min(max_key,e.getKey());
            }
        }

        if(max_key==Integer.MAX_VALUE)
        return -1;
        return max_key;
    }
}