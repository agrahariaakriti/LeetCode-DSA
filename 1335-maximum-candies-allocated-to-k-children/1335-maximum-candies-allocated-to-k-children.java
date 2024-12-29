class Solution {
    public int maximumCandies(int[] candies, long k) {
       int end=Integer.MIN_VALUE,sum=0;
       for(int i=0;i<candies.length;i++)
       {end=Math.max(end,candies[i]);sum+=candies[i];}
        long no_of_children=0;        
        int start=1,mid=0,result=0;
        while(start <= end)
        {
             mid=start+(end-start)/2;
           if(candies(candies,mid,k))
            {
                result=mid;
                start=mid+1;
            }
            else
            end=mid-1;
        }
    return result;
    }
boolean candies(int arr[],int min,long k)
{
    long children=0;
    for(int i=0;i<arr.length;i++)
    {
        children+=arr[i]/min;
        if(children>=k)
        return true;  
    }
    return false;
}

}