class Solution {
    public int countPrimeSetBits(int left, int right) {
    // we can solve this question by using the java inbuilt method 
        // first we will make hashset which store the the element of the prime numb
    Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        int count = 0;
        for (int i = left; i <= right; i++)
            count += primes.contains(Integer.bitCount(i)) ? 1 : 0;
        return count;
    }
}