class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start=0,end=1;
        int res=0;
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[res][end]>=intervals[i][start])
            {
                // ArrayList<Integer> temp=new ArrayList<>();
                intervals[res][start]=Math.min(intervals[res][start],intervals[i][start]);
                intervals[res][end]=Math.max(intervals[res][end],intervals[i][end]);
                // al.add(temp);
            }
            else
            {res++;
            intervals[res]=intervals[i];}
        }
        int interval[][]=new int[res+1][2];
        for(int i=0;i<=res;i++)
        {
            for(int j=0;j<2;j++)
            interval[i][j]=intervals[i][j];
        }
        return interval;
    }
}