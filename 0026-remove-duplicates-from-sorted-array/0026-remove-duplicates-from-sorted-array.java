class Solution {
    public int removeDuplicates(int[] nums) {
     ArrayList<Integer> al=new ArrayList<>();
    //  al.add()
     for(int i=0;i<nums.length;i++)
     {
        if(!al.contains(nums[i]))
        al.add(nums[i]);
     }
     for(int i=0;i<al.size();i++)
     nums[i]=al.get(i);
     return al.size();

    }
}