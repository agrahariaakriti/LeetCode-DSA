class Solution {
    public int largestRectangleArea(int[] heights) {
        int ns[]=new int[heights.length];
        int ps[]=new int[heights.length];
        ArrayDeque<Integer> al=new ArrayDeque<>();

        for(int i=heights.length-1;i>=0;i--)
        {
            while(!al.isEmpty() && heights[al.peek()]>=heights[i])
            al.pop();

            ns[i]=al.isEmpty()?heights.length : al.peek();
            al.push(i);
        }
        al.clear();
        for(int i=0;i<heights.length;i++)
        {
            while(!al.isEmpty() && heights[al.peek()]>=heights[i])
            al.pop();

            ps[i]=al.isEmpty()?-1 : al.peek();
            al.push(i);
        }
        int res=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<heights.length;i++)
        {
            curr=heights[i];
            curr+=(i-ps[i]-1)*heights[i];
           curr+=(ns[i]-i-1)*heights[i]; 
            res=Math.max(res,curr);
        }
        return res;
    }
}