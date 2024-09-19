class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    HashSet<List<Integer>> al=new HashSet<>();
    int sum2=0,p1=0,p2=0;
    for(int i=0;i<nums.length-2;i++)
    { p1=i+1;p2=nums.length-1;
        sum2=-nums[i];
        while(p1<p2)
        {
            if(nums[p1]+nums[p2]==sum2)
            {
                ArrayList<Integer> al1=new ArrayList<>();
                al1.add(nums[i]);
                al1.add(nums[p1]);
                al1.add(nums[p2]);
                al.add(al1);
                p1++;
                p2--;
            }
            else if(nums[p1]+nums[p2]>sum2)p2--;
            else p1++;
        }
    }
        return new ArrayList<>(al);    
}
}