class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int row=mat.length;
    int col=mat[0].length;
    if(r*c!=row*col)
    return mat;

    else
    {
        int res[][]=new int[r][c];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            al.add(mat[i][j]);
        }
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            res[i][j]=al.get(k++);
        }
        return res;
    }    
    
    }

}