class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> al=new ArrayList<>();
        if(matrix.length==1)
        {
            for(int i=0;i<matrix[0].length;i++)
            al.add(matrix[0][i]);
            return al;
        }
        if(matrix[0].length==1)
        {
            for(int i=0;i<matrix.length;i++)
            al.add(matrix[i][0]);
            return al;
        }
       
       else
        {int top=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        int left=0;
        while(top<=bottom && left<=right)
        {
        for(int i=left;i<=right;i++)
        {
            al.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            al.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom)
        {
            for(int i=right;i>=left;i--)
                al.add(matrix[bottom][i]);
                bottom--;}

         if(left<=right)
         {
            for(int i=bottom;i>=top;i--)
                al.add(matrix[i][left]);
                left++;
        }
        }
         return al;
        }    
    }
}