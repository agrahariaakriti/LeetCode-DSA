class Solution {
    public int[] sortArrayByParity(int[] nums) {   
        // if()
        int start=0,end=nums.length-1;
        int j=start-1;
        for(int i=0;i<end;i++)
        {
            if(nums[i]%2==0)
            {
                j++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        int temp=nums[end];
        nums[end]=nums[j+1];
        nums[j+1]=temp;
        return nums;
    }
}