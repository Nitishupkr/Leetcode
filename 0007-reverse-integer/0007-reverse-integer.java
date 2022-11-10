class Solution {
    public int reverse(int x) {

        long rem=0;
        long res=0;
        while(x!=0){
            rem=x%10;
            res=res*10+rem;
            x=x/10;
            
}
        if(res<Integer.MIN_VALUE||res>Integer.MAX_VALUE)return 0;
        return (int)res;
          
    }
};