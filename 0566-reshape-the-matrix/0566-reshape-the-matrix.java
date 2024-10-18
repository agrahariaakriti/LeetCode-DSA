class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int row=mat.length;
    int col=mat[0].length;
    if(r*c!=row*col)
    return mat;

    else
    {
        int res[][]=new int[r][c];
        int al[]=new int[row*col];
        int k=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            al[k++]=mat[i][j];
        }
        k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            res[i][j]=al[k++];
        }
        return res;
    }    
    
    }

}