class Reverse
{
    public static String reverseWord(String str)
    {
        String ans = "";
        if(str.length() == 0 || str == null){
            return ans;
        }
        else{
            int j=str.length()-1;
            while(j>=0){
                ans+=str.charAt(j);
                j--;
            }
            return ans;
        }
    }
}
