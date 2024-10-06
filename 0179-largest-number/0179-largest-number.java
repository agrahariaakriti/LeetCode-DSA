class Solution {
    public String largestNumber(int[] nums) {
    String arr[]=new String[nums.length];
    for(int i=0;i<arr.length;i++)
    arr[i]=Integer.toString(nums[i]);

    Arrays.sort(arr,(a,b)->(a+b).compareTo(b+a));
    if(arr[0]=="0")return "0";
    String s="";
    for(int i=arr.length-1;i>=0;i--)
    s+=arr[i];
    return s;


    }
}