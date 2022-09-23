class Solution {
    public int singleNumber(int[] nums) {
        //evry numb is appearing twice but then one numb is appearing once
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
}
        return ans;
    }
}