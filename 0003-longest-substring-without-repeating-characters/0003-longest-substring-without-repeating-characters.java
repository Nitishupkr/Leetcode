class Solution {
    public int lengthOfLongestSubstring(String s) {
    //          int[] arr = new int[128];
    //     int n = s.length();
    //     int len = 0;
    //     int i=0;
    //     for(int j = 0; j < n; j++){
    //         int c = s.charAt(j);
    //         arr[c]++;
    //         if(arr[c] > 1){
    //             while(arr[c] > 1){
    //                 arr[s.charAt(i)]--;
    //                 i++;
    //             }
    //         }
    //         len = Math.max(len, j - i + 1);
    //     }
    //     return len;
    // }
        int i =0;
        int j=0;
        int max=0;
        Set<Character>set=new HashSet<>();
    while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max=Math.max(max,set.size());
                
            }else{
                set.remove(s.charAt(i++));
            }
        }
            return max;
        }
}