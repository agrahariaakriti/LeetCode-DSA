class Solution {
    public int minGroups(int[][] intervals) {
      int arrival[]=new int[intervals.length];
      int departure[]=new int[intervals.length];
    
    for(int i=0;i<intervals.length;i++)
    arrival[i]=intervals[i][0];
    Arrays.sort(arrival);

    for(int i=0;i<intervals.length;i++)
    departure[i]=intervals[i][1];
    Arrays.sort(departure);
    int overlap=1,res=1;
    int i=1,j=0;
    while(i<intervals.length)
    {
        if(arrival[i]<=departure[j])
        {
            overlap+=1;
            res=Math.max(overlap,res);
            i++;
        }
        else
        {
            overlap--;
            j++;
        }
    }
    return res;
    }
}