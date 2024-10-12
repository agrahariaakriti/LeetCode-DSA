class Solution {
    public int trap(int[] height) {
        int n=height.length;
     int lmax[]=new int[height.length];
     int rmax[]=new int[height.length];
     lmax[0]=height[0];
     for(int i=1;i<height.length;i++)
        lmax[i]=(int)Math.max(lmax[i-1],height[i]);
     rmax[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--)
        rmax[i]=(int)Math.max(rmax[i+1],height[i]);
     int max=0,max_res=0;
     for(int i=0;i<n;i++)
     {
        max=(int)Math.min(lmax[i],rmax[i]);
        max_res+=max-height[i];
     }
     return max_res;



    }
}