//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        BigInteger n1, n2, ans;
        n1 = new BigInteger(s1);
        n2 = new BigInteger(s2);
        ans = n1.multiply(n2);
        return String.valueOf(ans);
    }
}
