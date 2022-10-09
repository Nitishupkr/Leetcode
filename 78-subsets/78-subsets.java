class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results= new ArrayList<>();
        if(nums==null||nums.length==0){
            return results;
        }
        Arrays.sort(nums);
        //first we need sort the array
           List<Integer>subset= new ArrayList<>();
        toFindAllsubset(nums,results,subset,0);
        return results;
    }
          
        private void toFindAllsubset(int [] nums,List<List<Integer>>results,List<Integer>subset,int startIndex){
            results.add(new ArrayList<>(subset));
            
                // we do the new arraylist because subset keep changing
            for(int i =startIndex;i<nums.length;i++){
                subset.add(nums[i]);
                 toFindAllsubset(nums,results,subset,i+1);
                subset.remove(subset.size()-1);
            }
        
    }
}
// Subsets of an array of length n is (2 to the power n). We will loop i from 0 to (2 to the power n). 
// Then take binary form of i and make a subset. As binary form contains 0 or 1 only, so if 1 comes, 
// then add the element from the array in the subset list, else not. In a subset of array, each element 
// has 2 choices, either it will come in the subset, or not come in the subset. So, 1 represents that
// element will come in the subset, 0 represents element will not come in the subset. 

// Example : nums = [1,2,3]
//           Number of subsets = (2 to the power 3) = 8. 
//           So, loop from 0 to 7.

// Loop (i)     |     Binary form     |     Subset we get
// 0            |       000           |       []
// 1            |       001           |       [3]
// 2            |       010           |       [2]
// 3            |       011           |       [2,3]
// 4            |       100           |       [1]
// 5            |       101           |       [1,3]
// 6            |       110           |       [1,2]
// 7            |       111           |       [1,2,3]

// */

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         //main list to store subsets.
//         List<List<Integer>> ml = new ArrayList<>();
//         int n = nums.length;
        
//         //total number of subsets = '2 to the power n' (1 << n = 1 * (2 to the power n) = 2 to the power n).
//         int numOfSub = 1 << n; 
        
//         //As number of subsets of an array of length n is (2 to the power n), so loop i from 0 till (2 to the power n).
//         for (int i = 0; i < numOfSub; i++) {
//             //child list to store a subset.
//             List<Integer> cl = new ArrayList<>();
//             //Store i in a temp variable as i is controlling outer loop and cannot be messed with.
//             int temp = i;
            
//             //We are looping backwards, as when we are calculating binary of a number, the first bit that 
// 			//comes after dividing the number with 2 is the LSB(Least Significant Bit) or the last bit of the 
// 			//number's binary form. 
// 			//For more clarification :- When calculating binary form of a number we divide it repeatedly
// 			//by 2 until the remainder becomes 0. After that we write the remainder that has come at every 
// 			//step of division backwards.
//             for (int j = n - 1; j >= 0; j--) {
//                 //Taking remainder. (temp & 1) is equal to (temp % 2)
//                 int rem = temp & 1;
//                 //Then dividing it by 2. (temp >> 1) is equal to (temp / 2).
//                 temp = temp >> 1;
                
//                 //If rem is equal to 1, then add nums[j].
//                 if (rem == 1) {
//                     cl.add(0, nums[j]);
//                 }
//             }
            
//             //After a subset is formed, add it in the main list.
//             ml.add(cl);
//         }
        
//         return ml;
//     }
// }
// Subsets of an array of length n is (2 to the power n). We will loop i from 0 to (2 to the power n). 
// Then take binary form of i and make a subset. As binary form contains 0 or 1 only, so if 1 comes, 
// then add the element from the array in the subset list, else not. In a subset of array, each element 
// has 2 choices, either it will come in the subset, or not come in the subset. So, 1 represents that
// element will come in the subset, 0 represents element will not come in the subset. 

// Example : nums = [1,2,3]
//           Number of subsets = (2 to the power 3) = 8. 
//           So, loop from 0 to 7.

// Loop (i)     |     Binary form     |     Subset we get
// 0            |       000           |       []
// 1            |       001           |       [3]
// 2            |       010           |       [2]
// 3            |       011           |       [2,3]
// 4            |       100           |       [1]
// 5            |       101           |       [1,3]
// 6            |       110           |       [1,2]
// 7            |       111           |       [1,2,3]

// */

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         //main list to store subsets.
//         List<List<Integer>> ml = new ArrayList<>();
//         int n = nums.length;
        
//         //total number of subsets = '2 to the power n' (1 << n = 1 * (2 to the power n) = 2 to the power n).
//         int numOfSub = 1 << n; 
        
//         //As number of subsets of an array of length n is (2 to the power n), so loop i from 0 till (2 to the power n).
//         for (int i = 0; i < numOfSub; i++) {
//             //child list to store a subset.
//             List<Integer> cl = new ArrayList<>();
//             //Store i in a temp variable as i is controlling outer loop and cannot be messed with.
//             int temp = i;
            
//             //We are looping backwards, as when we are calculating binary of a number, the first bit that 
// 			//comes after dividing the number with 2 is the LSB(Least Significant Bit) or the last bit of the 
// 			//number's binary form. 
// 			//For more clarification :- When calculating binary form of a number we divide it repeatedly
// 			//by 2 until the remainder becomes 0. After that we write the remainder that has come at every 
// 			//step of division backwards.
//             for (int j = n - 1; j >= 0; j--) {
//                 //Taking remainder. (temp & 1) is equal to (temp % 2)
//                 int rem = temp & 1;
//                 //Then dividing it by 2. (temp >> 1) is equal to (temp / 2).
//                 temp = temp >> 1;
                
//                 //If rem is equal to 1, then add nums[j].
//                 if (rem == 1) {
//                     cl.add(0, nums[j]);
//                 }
//             }
            
//             //After a subset is formed, add it in the main list.
//             ml.add(cl);
//         }
        
//         return ml;
//     }
// }
