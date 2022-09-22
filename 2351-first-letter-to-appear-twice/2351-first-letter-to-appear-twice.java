class Solution {
    public char repeatedCharacter(String s) {
      int[] aa = new int[26];
                for(Character i : s.toCharArray())
                {
                    ++aa[i-'a'];
                    if(aa[i-'a']==2) return i;
                }
                return 0;
            }
}