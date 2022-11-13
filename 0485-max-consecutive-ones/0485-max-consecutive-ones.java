class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int current_lead=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                current_lead+=1;
                max=Math.max(max,current_lead);
                
            }else{
                current_lead=0;
            }
            }
            return max;
        }
    }

