class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> al=new HashMap<>();
        int arr[]=new int[2];
       for(int i=0;i<nums.length;i++)
        {
            if(al.containsKey(target-nums[i]))
            {
                arr[0]=al.get(target-nums[i]);
                arr[1]=i;
                break;
            }
            al.put(nums[i],i);
        }
        return arr;
    }
}