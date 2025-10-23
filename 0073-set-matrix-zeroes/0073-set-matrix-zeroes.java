class Solution {
    public void setZeroes(int[][] matrix) {

        int row[]=new int[matrix.length];
        int col[]=new int[matrix[0].length]; 
        boolean firstrow=false;
        boolean firstcol=false;       
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==0 && matrix[0][j]==0)
                firstrow=true;
                if(j==0 && matrix[i][0]==0)
                firstcol=true;
                
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
            {
            for(int j=1;j<matrix[0].length;j++)
            {
                matrix[i][j]=0;
            }
            }
        }

        for(int i=1;i<matrix[0].length;i++)
        {
            if(matrix[0][i]==0)
            {
            for(int j=1;j<matrix.length;j++)
            {
                matrix[j][i]=0;
            }
            }
        }   

        if(firstrow==true)
        {
            for(int i=0;i<matrix[0].length;i++)
            matrix[0][i]=0;
        }

        if(firstcol==true)
        {
            for(int i=0;i<matrix.length;i++)
            matrix[i][0]=0;
        }


    }

}