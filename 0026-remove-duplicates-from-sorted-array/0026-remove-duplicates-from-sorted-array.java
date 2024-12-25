class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)
        return nums.length ;
        int p1=0;
        int p2=1;
        int len=1;
        for(int i=1;i<nums.length;i++)
        {
            p2=i;
            if(nums[p1] != nums[p2])
            {
                len=len+1;
                p1=p1+1;
                int temp=nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=temp;
            }
        }
        return len;
    }
}