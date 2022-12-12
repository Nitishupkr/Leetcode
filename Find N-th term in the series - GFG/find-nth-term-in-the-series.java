//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthOfSeries(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long nthOfSeries(long n){

        int i,j=3,num=9;

        if(n==1)

        {return num;}
        for(i=2;i<=n;i++)
        {num=num+(8*j);

        j=j+2;}

        return num; } }
