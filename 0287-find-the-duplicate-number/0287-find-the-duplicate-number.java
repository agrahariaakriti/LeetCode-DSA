class Solution {
    public int findDuplicate(int[] nums) {
    HashSet<Integer> al=new HashSet<>();
    for(int i=0;i<nums.length;i++)
    {
        if(al.contains(nums[i]))
            return nums[i];
        else
        al.add(nums[i]);
    }
    return -1;
    }
}