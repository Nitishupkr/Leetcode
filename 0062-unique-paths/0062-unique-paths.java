class Solution {
    private Map<String,Integer>map=new HashMap<String,Integer>();
    public int uniquePaths(int m, int n) {
        if(m==1||n==1) return 1;
        // check if we already visited path
        String cell=new String(m+","+n);
        //if we visited then take it from the cell
        if(map.containsKey(cell)){
            return map.get(cell);
        }
        int right=uniquePaths(m-1,n);
        int down=uniquePaths(m,n-1);
        map.put(cell,right+down);
        return right+down;
    }
}