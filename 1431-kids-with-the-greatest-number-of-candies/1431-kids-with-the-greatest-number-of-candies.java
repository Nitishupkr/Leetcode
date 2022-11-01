class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean>ans = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            Boolean test = false;
            for(int j = 0;j<candies.length;j++){
                if(candies[i]+extraCandies<candies[j]){
                    test = true;
                    break;
                }
            }
            if(test){
                ans.add(false);
                
            }else{
                ans.add(true);
            }
            
        }
        return ans;
    }
}