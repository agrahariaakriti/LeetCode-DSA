class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==3)
        return nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int mindiff=Integer.MAX_VALUE;
        int sum=0;
        int result=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int p1=i+1,p2=nums.length-1;
            while(p1<p2)
            {sum=nums[i]+nums[p1]+nums[p2];
                if(sum==target)
                return target;
                else if(sum<target)
                p1++;
                else p2--;

                int diff=Math.abs(target-sum);
                if(diff<mindiff)
                {
                    result=sum;
                    mindiff=diff;
                }
            }
        }
        return result;




    }
}