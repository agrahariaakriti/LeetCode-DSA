class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> al=new ArrayDeque<>();
        int arr[]=new int[nums.length-k+1];
        if(nums.length==1)
        return nums;

        for(int i=0;i<k;i++)
        {
            while(!al.isEmpty() && nums[al.peekLast()]<=nums[i])
            al.pollLast();
            al.offerLast(i);
        }
        int j=0;
        for(int i=k;i<nums.length;i++)
        {
            arr[j++]=nums[al.peekFirst()];
            if(!al.isEmpty() && al.peekFirst()<= i-k)
            al.pollFirst();

            while(!al.isEmpty() && nums[al.peekLast()] <=  nums[i])
            al.pollLast();

            al.offerLast(i);
        }
         arr[j++]=nums[al.peekFirst()];
        return arr;
    }
}