class Solution {
    public List<Integer> intersection(int[][] nums) {
     HashMap<Integer,Integer> al=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                al.put(nums[i][j],al.getOrDefault(nums[i][j],0)+1);
            }
        }
        ArrayList<Integer> al1=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: al.entrySet())
        if(e.getValue()==nums.length)
        al1.add(e.getKey());
        Collections.sort(al1);
        return al1;
    }
}