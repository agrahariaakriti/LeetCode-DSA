class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
    
    int max=Integer.MIN_VALUE;
    int res=0,row1=0,row=0;
    for(int i=0;i<mat.length;i++)
    {
        for(int j=0;j<mat[i].length;j++)
        {
            if(mat[i][j]==1)
            res++;
            row=i;
        }
        if(max<res)
        {
            max=res;
            row1=row;
        }
        res=0;
    }
    ArrayList<Integer> al=new ArrayList<>();
    int arr[]={row1,max};
    return arr;
    }
}