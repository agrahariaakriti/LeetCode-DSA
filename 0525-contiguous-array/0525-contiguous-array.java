class Solution {
    public int findMaxLength(int[] nums) 
    {    
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0)
            nums[i]=-1;
        int sum=0,res=0,sum2=0;
        HashMap<Integer,Integer> al=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
          sum+=nums[i];
          if(sum==0)
          res=i+1;
          if(!al.containsKey(sum+nums.length))
          {
            al.put(sum+nums.length,i);
          }
          else
          res=Math.max(res,i-al.get(sum+nums.length));
        }
        return res;

    }
}