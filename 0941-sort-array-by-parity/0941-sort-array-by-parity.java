class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            al1.add(nums[i]);
            else
            al2.add(nums[i]);
        }
        Collections.sort(al1);
        Collections.sort(al2);
        int k=0;
        for(int i=0;i<al1.size();i++)
        nums[k++]=al1.get(i);

        for(int i=0;i<al2.size();i++)
        nums[k++]=al2.get(i);

return nums;
    }
}