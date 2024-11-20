class Solution {
    public int longestConsecutive(int[] nums) {
        
        int res=0;
        HashSet<Integer> al=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        al.add(nums[i]);

        for(int x:al)
        {
            if(!al.contains(x-1))
            {
                int count=1;
                while(al.contains(x+count))
                count+=1;
                res=Math.max(res,count);
            }
        }
        return res;
    }
}