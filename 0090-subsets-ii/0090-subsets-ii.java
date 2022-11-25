class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
     List<List<Integer>>ans=new ArrayList<>();
        findallsubset(0,nums,new ArrayList<>(),ans);
        return ans;
        
    }
    public void findallsubset(int in,int [] nums,List<Integer>ds,List<List<Integer>>ans){
       ans.add(new ArrayList<>(ds));
        for(int i =in;i<nums.length;i++){
            if(i!=in&&nums[i]==nums[i-1])continue;
                ds.add(nums[i]);
                findallsubset(i+1,nums,ds,ans);
                ds.remove(ds.size()-1);
                    
            }
        
        
    }
}