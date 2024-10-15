class Solution {
    public long minimumSteps(String s) {   
    char arr[]=s.toCharArray();
    long total=0,count=0;
    int start=0,end=arr.length-1;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]=='0')
        total+=count;
        else
        count++;
    }
    
    return total;
    }
}