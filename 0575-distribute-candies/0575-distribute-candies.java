class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int type=1;
        for(int i=0;i<candyType.length;i++)
        {
            if(i>0 && candyType[i]!=candyType[i-1])
            type++;
        }
        return (type>=candyType.length/2)? candyType.length/2 : type;
    }
}