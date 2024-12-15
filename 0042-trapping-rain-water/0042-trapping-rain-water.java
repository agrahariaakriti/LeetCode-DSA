class Solution {
    public int trap(int[] height) {
        int area=0;
        int prefix[]= new int[height.length];
        int suffix[]= new int[height.length];
        int n=height.length;
        prefix[0]=height[0];
        for(int i=1;i<n-1;i++)
        {
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        suffix[n-1]=height[n-1];
        for(int i=n-2;i>=1;i--)
        {
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        for(int i=0;i<height.length-1;i++)
        {
            if(prefix[i]>height[i] && suffix[i]>height[i])
            {
                area+=(Math.min(suffix[i],prefix[i])-height[i]);
            }
        }
        return area;
    }
}