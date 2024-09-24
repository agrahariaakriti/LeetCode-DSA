class Solution {
    public int divide(int dividend, int divisor) {
        // if(Math.abs(divisor)==1)return -dividend;
        double l=(dividend/(divisor*1.0));
        return (int)l;
    }
}