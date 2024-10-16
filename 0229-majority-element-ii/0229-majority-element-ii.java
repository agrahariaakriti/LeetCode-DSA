class Solution {
    public List<Integer> majorityElement(int[] nums) {
    ArrayList<Integer> al=new ArrayList<>();
       Arrays.sort(nums);
        if(nums.length==1)
        {
            al.add(nums[0]);
            return al;
        }
        if(nums.length==2)
        {
            if(nums[0]==nums[1])
            {
                al.add(nums[0]);
                return al;
            }
            else
            {
                al.add(nums[0]);
                al.add(nums[1]);
                return al;
            }
        }



        else 
        {
            double n1=(nums.length)/3;
            int n=(int)Math.floor(n1);
            int count=1;
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i-1]==nums[i])
                {count++;
                if(count>n && !al.contains(nums[i]))
                al.add(nums[i]);
                }
                else{
                count=1;}
            }
            return al;
        }



    }
}