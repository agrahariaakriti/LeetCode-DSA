class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;
        for(int i=0;i<weights.length;i++)
        {start=Math.max(start,weights[i]);end+=weights[i];}

        while(start <= end)
        {
            int mid=start+(end-start)/2;
            int no_of_days=days(mid,weights);
            if(no_of_days <= days)
            end=mid-1;
            else
            start=mid+1;
        }
            return start;       
    }
    int days(int max_weight,int arr[])
    {
        int no_of_days=1;
        int wight=0;
        for(int i=0;i<arr.length;i++)
        {
            if(wight+arr[i] <= max_weight)
            { wight=wight+arr[i];}
            else
            {
                wight=arr[i];
                no_of_days+=1;
            }
        }
        return no_of_days;
    }

}