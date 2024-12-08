class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            int no=(int)Math.floor(Math.log10(nums[i])+1);
            if(no%2==0)
            res++;
        }
        return res;
    }
}