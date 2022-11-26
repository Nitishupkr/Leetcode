class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     List<List<Integer>> list = new LinkedList<>();
    Arrays.sort(candidates);
    backtrack(list, new ArrayList<>(),candidates, target, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] candidates, int target, int start){
    if(target < 0) return;
    else if(target == 0) list.add(new ArrayList<>(tempList));
    else{ 
        for(int i = start; i < candidates.length; i++){
            if(i>start&&candidates[i]==candidates[i-1])continue;
            tempList.add(candidates[i]);
            backtrack(list, tempList,candidates, target -candidates[i], i+1); // not i + 1 because we can reuse same elements}
            tempList.remove(tempList.size() - 1);
        }
    }
}
}
    
    