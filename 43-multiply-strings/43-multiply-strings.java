import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2)
    {
        BigInteger bg1= new BigInteger(num1);
        BigInteger bg2= new BigInteger(num2);
        
        return bg1.multiply(bg2).toString();
    }
}