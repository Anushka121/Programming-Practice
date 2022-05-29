class Solution {
    public String arrangeWords(String text) 
    {
        String[] s=text.toLowerCase().split(" ");
        Arrays.sort(s,(a,b)-> a.length()-b.length());
        String str=s[0];
        s[0]=str.substring(0, 1).toUpperCase() + str.substring(1);
        String result="";
        for(String string:s)
        {
            result=result+" "+string;
        }
        
        return result.substring(1);
    }
}