class Solution {
    public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//        for(int i=0;i<nums.length-1;i++){
//                if(nums[i]==nums[i+1]){
//                    return nums[i];
//                }
//            }
       
//         return nums.length;
//     }
// }
        int count[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
            if(count[nums[i]]>1){
                return nums[i];
                
            }
        }
        return nums.length;
    }
}
        