class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> al=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        al.put(nums[i],al.getOrDefault(nums[i],0)+1);
        ArrayList<Integer> al1=new ArrayList<>();
        double n1=(nums.length)/3;
        int n=(int)Math.floor(n1);
        for(Map.Entry<Integer,Integer> e: al.entrySet())
        {
            if(e.getValue()>n)
            al1.add(e.getKey());
        }
        return al1;


    }
}