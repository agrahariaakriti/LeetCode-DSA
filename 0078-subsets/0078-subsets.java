class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al1=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        subSet(nums,al1,al,0);
        return al1;
    }
    void subSet(int arr[],List<List<Integer>> al1,ArrayList<Integer> al,int i)
    {
        if(i==arr.length)
        {
            al1.add(new ArrayList<>(al));
            return ;
        }
        subSet(arr,al1,al,i+1);
        al.add(arr[i]);
        subSet(arr,al1,al,i+1);
        al.remove(al.size()-1);

    }

}
