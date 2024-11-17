class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> al=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            al.add(nums[i]);
        }
        int i=1;
        for( i=1;i<=nums.length;i++)
        if(!al.contains(i))
        return i;
        return i;
    }
}