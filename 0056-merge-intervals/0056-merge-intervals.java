class Solution {
    public int[][] merge(int[][] intervals) {
    
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
    int res=0;
    for(int i=1;i<intervals.length;i++)
    {
        if(intervals[res][1]>=intervals[i][0])
        {
            intervals[res][0]=Math.min(intervals[res][0],intervals[i][0]);
            intervals[res][1]=Math.max(intervals[res][1],intervals[i][1]);
        }
        else
        {
            res++;
            intervals[res]=intervals[i];
        }
    }
    int res1[][]=new int[res+1][2];
    for(int i=0;i<=res;i++)
    {
    res1[i]=intervals[i];
    }
    return res1;
    }
    
}