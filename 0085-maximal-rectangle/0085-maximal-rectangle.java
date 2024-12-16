class Solution {
    public int maximalRectangle(char[][] matrix) {

       int heights[]=new int[matrix[0].length];
       int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]=='1')
                {
                heights[j]++;
                }
                else
                heights[j]=0;
            }
            maxArea=Math.max(maxArea,largestRectangleArea(heights));
        }
        return maxArea;
    }
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
            curr=(ns[i]-ps[i]-1)*heights[i]; 
            res=Math.max(res,curr);
        }
        return res;
    }

}