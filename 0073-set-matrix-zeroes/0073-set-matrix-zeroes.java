class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix[0].length;
        int m=matrix.length;
        int rows[]=new int[m];
        int col[]=new int[n];
        Arrays.fill(rows,1);
                Arrays.fill(col,1);

        for(int i =0;i<m;i++){
for(int j=0;j<n;j++){
    if(matrix[i][j]==0){
        rows[i]=0;
        col[j]=0;
    }
}
            }
                for(int i =0;i<m;i++){
for(int j=0;j<n;j++){
    if(rows[i]==0||col[j]==0){
       matrix[i][j]=0; 
    }
}
                }
        
    }
}