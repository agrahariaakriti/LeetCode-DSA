class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
           if(binarySearch(arr,0,arr.length-1,arr[i]*2,i))
           return true;
        }
        return false;
    }

    boolean binarySearch(int arr[],int start,int  end ,int target,int ind)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target && mid!=ind)
            return true;
            else if(arr[mid]>target)
            end=mid-1;
            else start=mid+1;
        }
        return false;

    }
}