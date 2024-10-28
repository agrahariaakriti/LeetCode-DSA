import java.math.*;
class Solution {
    public String multiply(String num1, String num2) { 
    // return Integer.toString(Integer.parseInt(num1)*Integer.parseInt(num2));


    //  BigInteger b1=new BigInteger(num1);
    //  BigInteger b2=new BigInteger(num2); 
    //     BigInteger b=b1.multiply(b2);
    // long res=n1*n2;
    return ((new BigInteger(num1)).multiply(new BigInteger(num2))).toString();

    
    }
}