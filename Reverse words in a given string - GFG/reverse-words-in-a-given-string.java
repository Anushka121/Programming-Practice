// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
      
       String s[]= S.split("\\.");
       //System.out.println(Arrays.toString(s));
       
      int i=0;
      int j=s.length-1;
       while(i<j)
       {
           String temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
         
       }
       String joined=" ";
       for(String str:s)
       {
           joined=joined+str+".";
        }       
       return joined.substring(1,joined.length()-1);
    }
}