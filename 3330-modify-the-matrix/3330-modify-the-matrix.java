class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        ArrayList<Integer> al=new ArrayList<>();
        int max=-1;
        for(int j=0;j<matrix[0].length;j++)
        {
            for(int i=0;i<matrix.length;i++)
            {
                max=(int)Math.max(matrix[i][j],max);
            }
            al.add(max);
            max=0;
        }
        int k=0;
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[j][i]==-1)
                {
                    int n=al.get(k);
                     matrix[j][i]=n;
                }
            }
            k++;
        }
        return matrix;
    }
}