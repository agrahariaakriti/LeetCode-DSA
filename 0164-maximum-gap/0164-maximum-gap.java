class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2)return 0;
        int res=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            res=Math.max(Math.abs(nums[i]-nums[i-1]),res);
        }
        return res;


    }
}