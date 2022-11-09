class Solution {
    public int numberOfSteps(int num) {
//         return Integer.toBinaryString(num).length()-1+Integer.bitCount(num);
//         }
// }
       
        return helper(num, 0);
    }

    private int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}
