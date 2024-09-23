class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
    return nums;
     }
    void mergeSort(int nums[],int start,int end)
    {
        if(end>start)
        {
            int mid=start+(end-start)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    void merge(int nums[],int start,int mid,int end)
    {
        int n1=mid+1-start;
        int n2=end-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++)
        arr1[i]=nums[start+i];
        for(int j=0;j<n2;j++)
        arr2[j]=nums[mid+1+j];
      
      int i=0,j=0,k=start;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<=arr2[j])
            nums[k++]=arr1[i++];
            else 
            nums[k++]=arr2[j++];
        }
        while(i<n1)
        nums[k++]=arr1[i++];
        while(j<n2)
        nums[k++]=arr2[j++];
    }



}