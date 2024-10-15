class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[i].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int right=matrix.length-1;
        for(int i=0;i<matrix[0].length/2;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                int temp=matrix[j][i];
                matrix[j][i]=matrix[j][right];
                matrix[j][right]=temp;
            }
            right--;
        }
    }
}