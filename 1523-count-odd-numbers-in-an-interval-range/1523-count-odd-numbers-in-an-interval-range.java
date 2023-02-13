class Solution {
    public int countOdds(int low, int high) {
        int nums=high-low+1;
        while(low%2!=0&&high%2!=0){
            return nums/2+1;
        }
        return nums/2;
    }
}