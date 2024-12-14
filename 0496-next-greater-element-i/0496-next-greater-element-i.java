class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayDeque<Integer> al=new ArrayDeque<>();
        // int arr[]=new int[nums2.length];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!al.isEmpty() && al.peek()<nums2[i])
            al.pop();
            h.put(nums2[i],(al.isEmpty())?-1:al.peek());
            // arr[i]=(al.isEmpty())? -1 :al.peek();
            al.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=h.get(nums1[i]);
        }

        return nums1;
         


    }
}