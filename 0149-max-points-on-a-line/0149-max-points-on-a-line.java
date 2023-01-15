class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;
        if(n<=2) return n;
        int ans=2;
        for(int[] a:points){
          Map<Double,Integer>map=new HashMap<>();
            for(int []b:points){
                if(a==b)continue;//dont measure the slope for the same point in the plane
                double slope=0;
                if(b[0]-a[0]==0) slope=Double.POSITIVE_INFINITY;
                else slope = (b[1] -a[1]) / (double)(b[0] - a[0]);
                map.put(slope,map.getOrDefault(slope,1)+1);
                ans=Math.max(ans,map.get(slope));
                
                
            }
        }
        return ans;
    }
}