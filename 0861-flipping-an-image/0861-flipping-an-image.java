class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                if(image[i][j]==1)
                image[i][j]=0;
                else
                image[i][j]=1;
            }
        }
        int cj=image[0].length-1;
        int res[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                res[i][cj]=image[i][j];
                cj--;
            }
            cj=image[i].length-1;
        }

        return res;
    }
}