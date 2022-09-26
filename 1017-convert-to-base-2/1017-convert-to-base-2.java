class Solution {
    public String baseNeg2(int n) {
        return Integer.toBinaryString(1431655765 ^ (1431655765 - n));
    }
}