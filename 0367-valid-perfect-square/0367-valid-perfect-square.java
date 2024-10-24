class Solution {
    public boolean isPerfectSquare(int num) {
     int start=1;int end=num;
     while(start<=end)
     {
        int mid=(start+end)/2;
        long sqrt=(long)mid*mid;
        if(sqrt==(long)num)return true;
        else if(sqrt>(long)num)end=mid-1;
        else start=mid+1;
     }   
     return false;
    }
}