class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> al=new ArrayList<>();
     Arrays.sort(nums);
    //  int end=nums.length-1;
    for(int i=0;i<nums.length;i++)
    {
        if(i>0 && nums[i]==nums[i-1])
        continue;
        int end=nums.length-1;
        int start=i+1;
        int target=-nums[i];
        while(start<end)
        {
            if(nums[start]+nums[end]==target)
            {
                ArrayList<Integer> res=new ArrayList<>();
                res.add(nums[i]);
                res.add(nums[start]);
                res.add(nums[end]);
                al.add(res);
                start++;
                end--;
                while(start<end && nums[start]==nums[start-1]) start++;
                while(start<end && nums[end]==nums[end+1]) end--;               
            }
            else if(nums[start]+nums[end]>target)
            end--;
            else
            start++;
        }
    }
    return al;

    }
}