class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=1001;
        //first we hav to find the the min and the max from the the given array and after that we will apply the eclead algorithm
        for(int e:nums){
            max=Math.max(max,e);
            min=Math.min(min,e);
            
        }
        return gcd(max,min);
    }
    public int gcd(int x,int y){
        if(y==0)
            return x;
        return gcd(y,x%y);
    }
}