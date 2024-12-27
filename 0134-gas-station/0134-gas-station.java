class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas1=0;
        int dist=0;
        int pro=0;
        int index=0;
        for(int i=0;i<gas.length;i++)
        {
            gas1+=gas[i];
            dist+=cost[i];
            pro+=(gas[i]-cost[i]);
            if(pro<0)
            {
                pro=00;
                index=i+1;
            }
        }
        if(gas1<dist)
        return -1;
        else
        return index;
    }
}