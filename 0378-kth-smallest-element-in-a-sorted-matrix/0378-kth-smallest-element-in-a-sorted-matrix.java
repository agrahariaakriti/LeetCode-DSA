class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    int n=matrix.length*matrix[0].length;
    if(n==1)return matrix[0][0];
    int arr[]=new int [n];
    int k1=0;
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[i].length;j++)
        arr[k1++]=matrix[i][j];
    }
    Arrays.sort(arr);
    return arr[k-1];

    }
}