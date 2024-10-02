class Solution {
    public int thirdMax(int[] nums) {
    Arrays.sort(nums);
     if(nums.length<3)
     return nums[nums.length-1];
    ArrayList<Integer> al=new ArrayList<>();
    al.add(nums[0]);
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]!=nums[i-1])
        al.add(nums[i]);
    }
    if(al.size()<3)return al.get(al.size()-1);
    return al.get(al.size()-3);



    }
}