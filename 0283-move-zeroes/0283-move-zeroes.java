class Solution {
    public void moveZeroes(int[] nums) {
            
	    int index =0 ; // the place where the non zeroes element is stored
	    for(int i =0;i<nums.length;i++) {
	    	if(nums[i]!=0) {
	    		nums[index] =nums[i];
	    		index++;
	    	}
	    		
	    	}
	    	
	    		for(int i=index;i<nums.length;i++) {
	    			nums[i]=0;
	    			
                }

        
    }
    
}
       