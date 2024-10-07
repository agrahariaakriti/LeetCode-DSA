class Solution {
    public void wiggleSort(int[] nums) {
     Arrays.sort(nums);
    int n=nums.length;
    int j=n-1;
    int res[]=new int[nums.length];
    for(int i=1;i<n && j<n;i+=2)
    {
        res[i]=nums[j--];
    }
    for(int i=0;i<n;i+=2)
    res[i]=nums[j--];
    
    for(int i=0;i<n;i++)
    nums[i]=res[i];

    } 
}