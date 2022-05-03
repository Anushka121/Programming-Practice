// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.rectanglesInChessBoard(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long rectanglesInChessBoard(Long N)
    {
       if(N==1)return 0l;
       else
       return (N-1)*(N*N)+rectanglesInChessBoard(N-1);
    }
};