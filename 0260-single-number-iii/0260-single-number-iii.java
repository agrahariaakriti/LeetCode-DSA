class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        int res=0,res1=0,res2=0;
        for(int i=0;i<nums.length;i++)
        res^=nums[i];
        int k=res&~(res-1);
        for(int i=0;i<nums.length;i++)
        {
            if((k&nums[i])!=0)
            res1^=nums[i];
            else
            res2^=nums[i];
        }
        arr[0]=res1;
        arr[1]=res2;
        return arr;
    }
}