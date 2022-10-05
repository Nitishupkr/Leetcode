class Solution {
    public int[] singleNumber(int[] nums) {
        int result =nums[0];
        for(int i =1;i<nums.length;i++){
            result^=nums[i];
        }
             // find the lowest bit
         int lowbit =  result&-result;
            int []r=new int[2];
            for(int n:nums){
                if((n&lowbit)==0) r[0]^=n;
                else
                    r[1]^=n;
                    
                    
                
            }
        
        return r;
    }
}