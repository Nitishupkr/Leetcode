class Solution {
    public int search(int[] nums, int target) {
return binary(nums,target,0,nums.length-1);
    }
        
   public int  binary(int [] nums,int target,int s,int e){
            if(s<=e){
         
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                return binary(nums,target,s,mid-1);
                
            }
            return binary(nums,target,mid+1,e);
        }
        return -1;
        }
}