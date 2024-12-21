class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> al= new ArrayDeque<>();

        int maxArea=0;
        for(int i=0;i<heights.length;i++)
        {
            while(!al.isEmpty() && heights[al.peek()]>heights[i])
            {
                int element=heights[al.peek()];
                al.pop();
                int nsm=i;
                int psm=al.isEmpty() ? -1 : al.peek();
                maxArea=Math.max(maxArea,element*(nsm-psm-1));
            }
            al.push(i);
        }
        while(!al.isEmpty())
        {
            int element=heights[al.peek()];
            al.pop();
            int nsm=heights.length;
            int psm=al.isEmpty() ? -1 : al.peek();
            maxArea=Math.max(maxArea,element*(nsm-psm-1));        
        }
        return maxArea;
    }
}