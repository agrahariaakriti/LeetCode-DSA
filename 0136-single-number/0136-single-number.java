class Solution {
    public int singleNumber(int[] nums) {
        int no=0;
        for ( int x: nums)
        no^=x;
        return no;
    }
}