class Solution {
    public int maximum69Number (int num) {
        if(Math.log10(num)==0 && num==6)
        return 9;
        else if(num==9)
        return num;

        int arr[]=new int[(int)Math.log10(num)+1];
        for(int i=arr.length-1;i>=0;i--)
        {
            arr[i]=num%10;
            num=num/10;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==6)
            {
                arr[i]=9;break;
            }
        }
        // int res=0;
        num=0;
        for(int i=0;i<arr.length;i++)
        {
            num=num*10+arr[i];
        }
        return num;      
    }
}