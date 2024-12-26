class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int normal_sum=kadaneAlgoMaxSum(nums);
        if(normal_sum<0)
        return normal_sum;

        int arraySum=0;
        for(int i=0;i<nums.length;i++)
        arraySum+=nums[i];

        int max_circularSum=arraySum-kadaneAlgoSum(nums);
        return Math.max(max_circularSum,normal_sum);

    }
    int kadaneAlgoMaxSum(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
    int kadaneAlgoSum(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=Math.min(arr[i],sum+arr[i]);
            min=Math.min(sum,min);
        }
        return min;
    }
}