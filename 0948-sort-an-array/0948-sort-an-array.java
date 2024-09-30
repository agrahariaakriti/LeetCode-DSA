class Solution {
    public int[] sortArray(int[] nums) {
     mergeSort(nums,0,nums.length-1);
     return nums;   
    }
void mergeSort(int arr[],int start,int end)
{
    if(start<end)
    {int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end) ;
        merge(arr,start,end,mid); 
    }
}
   void merge(int arr[],int start,int end,int mid)
    {
        int n1=mid+1-start;
        int n2=end-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        
        for(int i=0;i<n1;i++)
        left[i]=arr[start+i];

        for(int i=0;i<n2;i++)
        right[i]=arr[mid+1+i];

        int i=0,j=0,k=start;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            arr[k++]=left[i++];

            else 
            arr[k++]=right[j++];
        }
        while(i<n1)
        arr[k++]=left[i++];

        while(j<n2)
        arr[k++]=right[j++];
    }
}

