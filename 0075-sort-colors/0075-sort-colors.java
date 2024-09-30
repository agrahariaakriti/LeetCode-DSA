class Solution {
    public void sortColors(int[] nums) {
       QuickSort(nums,0,nums.length-1); 
 
    }

   void QuickSort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int p=partition(arr,start,end);
            QuickSort(arr,start,p-1);
            QuickSort(arr,p+1,end);
        }
    }
int partition(int arr[],int start,int end)
{
    int i=start-1;
    int pivort=arr[end];
    for(int j=start;j<end;j++)
    {
        if(arr[j]<pivort)
        {
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
             arr[i]=temp;
        }
    }
    int temp=arr[i+1];
    arr[i+1]=arr[end];
    arr[end]=temp;
    return i+1;
    }
}
