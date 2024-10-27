class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber<=26)
        return String.valueOf((char)((columnNumber-1)%26+'A'));
        String s="";
        while(columnNumber>26)
        {
            columnNumber=columnNumber-1;
            s=String.valueOf((char)((columnNumber)%26+'A'))+s;
            columnNumber/=26;
        }
        return String.valueOf((char)((columnNumber-1)%26+'A'))+s;
    }
}