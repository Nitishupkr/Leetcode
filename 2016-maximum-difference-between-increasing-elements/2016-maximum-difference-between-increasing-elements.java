class Solution {
    public int maximumDifference(int[] nums) {
                  int min = nums[0];
        int diff = -1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] > min){
                int d=nums[i]-min;
                diff = Math.max(diff, d);
            }else{
                min = nums[i];
            }
        }
        
        return diff;
    }
}