class Solution {
    public int findComplement(int num) {

        int comp= (Integer.highestOneBit(num<<1)-1);
        return comp^num;
    }
}