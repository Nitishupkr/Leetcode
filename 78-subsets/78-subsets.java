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
