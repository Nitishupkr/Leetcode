class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer>set=new HashSet<>();
        set.add(distancesqaure(p1,p2));
        set.add(distancesqaure(p1,p3));
        set.add(distancesqaure(p1,p4));
        set.add(distancesqaure(p3,p4));
        set.add(distancesqaure(p2,p4));
        set.add(distancesqaure(p2,p3));
         return !set.contains(0)&& set.size()==2;
           }
    
        private int distancesqaure(int []a,int []b){
            //here we are using the pythagorean theorem
            return (a[0]-b[0])*(a[0]-b[0])+(b[1]-a[1])*(b[1]-a[1]);
     
}
}