class Solution {
    public int singleNumber(int[] nums) {
        int n =nums.length;
        int []arr= new int[32];
        	for (int num : nums) {
        for(int i =0;i<32;i++){
            // we iterate the for loop for the 32 bit number to store the given array
       
                // we iterate the forloop for the given array
       		arr[i] += num & 1;
			num >>= 1;
           
            }
        
}
                int res=0;
        	for (int i = 0; i < 32; i++) {
         res+=(arr[i] % 3) << i ;     
    }
        return res;
}
}
