class Solution {
    public int findKthPositive(int[] arr, int k) {
    int j = 0, i = 0, n = arr[arr.length-1];
    
    for( i = 0; i < n; i++ ){
        if( arr[j] == i ){
            j++;
        }else{
            if( k-- == 0 ) return i;
        }
    }
    
    return i+k+1;
}
}