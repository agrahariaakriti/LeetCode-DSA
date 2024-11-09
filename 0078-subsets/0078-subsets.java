class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> al=new ArrayList<>();
    int p=1<<nums.length;
    for(int i=0;i<p;i++)
    {
        al.add(new ArrayList<>());
        for(int j=0;j<nums.length;j++)
        {
            if((i&(1<<j))!=0)
            al.get(i).add(nums[j]);
        }
    }    
    return al;    
    }

}