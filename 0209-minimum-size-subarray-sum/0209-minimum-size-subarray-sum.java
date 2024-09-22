class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
       int p1=0,p2=0,sum=0,l=0;
        int min=Integer.MAX_VALUE;
       while(p2<nums.length)
       {
        sum+=nums[p2];
            while(sum>=target)
            {
               min=Math.min(min,p2-p1+1);
                sum-=nums[p1];
                p1++;
            }
                    p2++;
       }
       if(min>=Integer.MAX_VALUE) return 0;
       return min;
        
    }
}