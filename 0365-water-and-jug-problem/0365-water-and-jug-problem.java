class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(jug1Capacity+jug2Capacity < targetCapacity) return false; //Capacity of both jug combined is less than target
        return targetCapacity% gcd(jug1Capacity,jug2Capacity) ==0; //Only condition where the equation is solvable
    }
    public int gcd(int x, int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
}